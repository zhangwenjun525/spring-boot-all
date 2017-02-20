package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.App;
import com.zhangwj.project.springdata.jpa.domain.Human;
import com.zhangwj.project.springdata.jpa.domain.IdCard;
import com.zhangwj.project.springdata.jpa.service.IBookService;
import com.zhangwj.project.springdata.jpa.service.IHumanService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HumanServiceTest {

    private IHumanService humanService;

    @Before
    public void before() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        humanService = applicationContext.getBean(IHumanService.class);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: save(Human human)
     */
    @Test
    public void testSave() throws Exception {
        IdCard idCard = new IdCard();
        idCard.setNum("362502199005252018");

        Human human = new Human();
        human.setName("章文君");
        human.setAge(27);
        human.setIdCard(idCard);

        humanService.save(human);
    }

    @Test
    public void testFindById(){
        Human human = humanService.findById(2);
        System.out.println(human);
    }


} 
