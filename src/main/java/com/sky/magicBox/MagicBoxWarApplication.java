package com.sky.magicBox;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <p>war包发布方式<p/>
 * @ProjectName:
 * @ClassName: MagicBoxWarApplication
 * @Description: 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
 * @Author: sky.liu
 * @Date: 2018/8/23 22:42
 * @Version 1.0
 * @ChangeLog
 */
@SpringBootApplication
public class MagicBoxWarApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        System.out.println("┏┓　　　┏┓\n" +
                "  ┏┛┻━━━┛┻┓\n" +
                "  ┃　　　　　　　┃\n" +
                "  ┃　　　━　　　┃\n" +
                "  ┃　┳┛　┗┳　┃\n" +
                "  ┃　　　　　　　┃\n" +
                "  ┃　　　┻　　　┃\n" +
                "  ┃　　　　　　　┃\n" +
                "  ┗━┓　　　┏━┛\n" +
                "  　　┃　　　┃神兽保佑\n" +
                "  　　┃　　　┃代码无BUG！\n" +
                "  　　┃　　　┗━━━┓\n" +
                "  　　┃　　　　　　　┣┓\n" +
                "  　　┃　　　　　　　┏┛\n" +
                "  　　┗┓┓┏━┳┓┏┛\n" +
                "  　　　┃┫┫　┃┫┫\n" +
                "  　　　┗┻┛　┗┻┛");
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(MagicBoxApplication.class);
    }

}
