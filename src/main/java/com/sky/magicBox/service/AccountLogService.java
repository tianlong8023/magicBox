package com.sky.magicBox.service;

import com.sky.magicBox.domain.bo.AuthAccountLog;

import java.util.List;

/* *
 * @Author skyliu
 * @Description 
 * @Date 9:30 2018/4/22
 */
public interface AccountLogService {

    List<AuthAccountLog> getAccountLogList();
}
