package com.sky.magicBox;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.sky.magicBox.support.XssSqlStringJsonSerializer;
import org.mybatis.spring.annotation.MapperScan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;


@SpringBootApplication
@MapperScan("com.sky.magicBox.dao")
@EnableCaching
@ServletComponentScan
public class MagicBoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicBoxApplication.class, args);
	}

	@Bean
	@Primary
	public ObjectMapper xssObjectMapper(Jackson2ObjectMapperBuilder builder) {
		// 解析器
		ObjectMapper objectMapper = builder.createXmlMapper(false).build();
		// 注册XSS SQL 解析器
		SimpleModule xssModule = new SimpleModule("XssStringJsonSerializer");
		xssModule.addSerializer(new XssSqlStringJsonSerializer());
		objectMapper.registerModule(xssModule);
		return objectMapper;
	}

}
