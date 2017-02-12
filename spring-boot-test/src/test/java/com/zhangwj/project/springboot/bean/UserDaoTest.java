package com.zhangwj.project.springboot.bean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @MockBean
    private UserMapper userMapper;


    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: addUser(String username)
     */
    @Test
    public void testAddUser() throws Exception {
        Assert.assertEquals(userDao.addUser("1"), new Integer(1));
        Assert.assertEquals(userDao.addUser(null), new Integer(0));

        BDDMockito.given(userMapper.addUser(null)).willThrow(NullPointerException.class);
        BDDMockito.given(userMapper.addUser("")).willReturn(Integer.valueOf(0));
        BDDMockito.given(userMapper.addUser("zhang")).willReturn(Integer.valueOf(1));

    }




} 
