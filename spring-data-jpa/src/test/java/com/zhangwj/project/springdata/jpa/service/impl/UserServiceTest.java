package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.App;
import com.zhangwj.project.springdata.jpa.domain.User;
import com.zhangwj.project.springdata.jpa.service.ISchoolService;
import com.zhangwj.project.springdata.jpa.service.IStudentService;
import com.zhangwj.project.springdata.jpa.service.IUserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserServiceTest {

    private IUserService userService;

    @Before
    public void before() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        userService = applicationContext.getBean(IUserService.class);
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testAdd() throws Exception {
        User user = new User();
        user.setUsername("章文君");
        user.setPassword("123456789");
        userService.add(user);
    }

/*    @Test
    public void testUpdate(){
        User user = userService.findOne(2);
        user.setUsername("章文君2");
        userService.update(user);
    }*/


} 
