package com.minlian.simulate.ioc.service.impl;

import com.minlian.simulate.ioc.dao.IAccountDao;
import com.minlian.simulate.ioc.dao.impl.AccountDaoImpl;
import com.minlian.simulate.ioc.factory.BeanFactory;
import com.minlian.simulate.ioc.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    IAccountDao accountDao = (IAccountDao) BeanFactory.getBean("accountDao");
    public void saveAccount() {
        System.out.println("Dao的实现类创建成功"+accountDao);
        accountDao.saveAccount();
        System.out.println("service层：执行成功");
    }
}
