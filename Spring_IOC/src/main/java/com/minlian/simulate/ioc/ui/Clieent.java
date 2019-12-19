package com.minlian.simulate.ioc.ui;

import com.minlian.simulate.ioc.factory.BeanFactory;
import com.minlian.simulate.ioc.service.IAccountService;
import com.minlian.simulate.ioc.service.impl.AccountServiceImpl;

public class Clieent {

     public static void main(String[] args) {
         IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
         System.out.println("Service的实现类创建成功"+as);
         as.saveAccount();
     }

}
