package com.sky.magicBox.shiro.provider.impl;


import com.sky.magicBox.domain.vo.Account;
import com.sky.magicBox.service.AccountService;
import com.sky.magicBox.shiro.provider.AccountProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/* *
 * @Author skyliu
 * @Description 
 * @Date 9:22 2018/2/13
 */
@Service("AccountProvider")
public class AccountProviderImpl implements AccountProvider {

      @Autowired
      @Qualifier("AccountService")
      private AccountService accountService;

    public Account loadAccount(String appId) {
        return accountService.loadAccount(appId);
    }
}
