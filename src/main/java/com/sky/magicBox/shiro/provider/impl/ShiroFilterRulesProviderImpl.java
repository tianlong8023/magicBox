package com.sky.magicBox.shiro.provider.impl;

import com.sky.magicBox.dao.AuthResourceMapper;
import com.sky.magicBox.shiro.provider.ShiroFilterRulesProvider;
import com.sky.magicBox.shiro.rule.RolePermRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* *
 * @Author skyliu
 * @Description 
 * @Date 16:46 2018/3/7
 */
@Service("ShiroFilterRulesProvider")
public class ShiroFilterRulesProviderImpl implements ShiroFilterRulesProvider {

    @Autowired
    private AuthResourceMapper authResourceMapper;

    @Override
    public List<RolePermRule> loadRolePermRules() {

        return authResourceMapper.selectRoleRules();
    }

}
