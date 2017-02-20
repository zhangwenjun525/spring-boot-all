package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.App;
import com.zhangwj.project.springdata.jpa.service.IHumanService;
import com.zhangwj.project.springdata.jpa.service.IIdCardService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IdCardServiceTest {

    private IIdCardService idCardService;

    @Before
    public void before() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        idCardService = applicationContext.getBean(IIdCardService.class);
    }


    @After
    public void after() throws Exception {
    }

    /**
     * Method: findById(Integer id)
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println(idCardService.findById(2));
    }


} 
