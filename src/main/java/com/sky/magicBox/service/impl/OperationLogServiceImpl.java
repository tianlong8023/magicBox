package com.sky.magicBox.service.impl;

import com.sky.magicBox.dao.AuthOperationLogMapper;
import com.sky.magicBox.domain.bo.AuthOperationLog;
import com.sky.magicBox.service.OperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* *
 * @Author tomsun28
 * @Description 
 * @Date 9:34 2018/4/22
 */
@Service
public class OperationLogServiceImpl implements OperationLogService {

    @Autowired
    AuthOperationLogMapper authOperationLogMapper;

    @Override
    public List<AuthOperationLog> getOperationList() {
        return authOperationLogMapper.selectOperationLogList();
    }
}
