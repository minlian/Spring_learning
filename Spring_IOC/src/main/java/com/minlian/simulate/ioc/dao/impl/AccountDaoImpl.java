package com.minlian.simulate.ioc.dao.impl;

import com.minlian.simulate.ioc.dao.IAccountDao;

public class AccountDaoImpl implements IAccountDao {
    public void saveAccount() {
        System.out.println("Dao层，保存账户成功");
    }
}
