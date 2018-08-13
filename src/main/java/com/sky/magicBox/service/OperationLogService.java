package com.sky.magicBox.service;

import com.sky.magicBox.domain.bo.AuthOperationLog;

import java.util.List;

/* *
 * @Author skyliu
 * @Description 
 * @Date 9:30 2018/4/22
 */
public interface OperationLogService {

    List<AuthOperationLog> getOperationList();
}
