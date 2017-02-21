package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.App;
import com.zhangwj.project.springdata.jpa.domain.Account;
import com.zhangwj.project.springdata.jpa.service.IAccountService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountServiceTest {

    private IAccountService accountService;

    @Before
    public void before() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        accountService = applicationContext.getBean(IAccountService.class);
    }
    @After
    public void after() throws Exception {
    }

    /**
     * Method: save(Account account)
     */
    @Test
    public void testSave() throws Exception {
        Account account = new Account();
        account.setMoney(123456789D);
        accountService.save(account);
    }


} 
