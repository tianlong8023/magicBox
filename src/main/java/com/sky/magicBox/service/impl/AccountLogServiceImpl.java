package com.sky.magicBox.service.impl;

import com.sky.magicBox.dao.AuthAccountLogMapper;
import com.sky.magicBox.domain.bo.AuthAccountLog;
import com.sky.magicBox.service.AccountLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* *
 * @Author skyliu
 * @Description 
 * @Date 9:32 2018/4/22
 */
@Service
public class AccountLogServiceImpl implements AccountLogService {

    @Autowired
    AuthAccountLogMapper authAccountLogMapper;

    @Override
    public List<AuthAccountLog> getAccountLogList() {
        return authAccountLogMapper.selectAccountLogList();
    }
}
