package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.App;
import com.zhangwj.project.springdata.jpa.domain.Person;
import com.zhangwj.project.springdata.jpa.service.IPersonService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;

public class PersonServiceTest {

    private IPersonService personService;

    @Before
    public void before() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        personService = applicationContext.getBean(IPersonService.class);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: save(Person person)
     */
    @Test
    public void testSave() throws Exception {

    }

    /**
     * Method: findById(Integer id)
     */
    @Test
    public void testFindById() throws Exception {
        Person person = personService.findById(1);
        System.out.println(person);
    }

    @Test
    public void testFindAll(){
        Page<Person> page = personService.findAll(0, 10);
        System.out.println(page.getContent());
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
        System.out.println(page.getNumber());
        System.out.println(page.getNumberOfElements());
    }

    @Test
    public void testFindByName(){
     personService.findByName("章文君").forEach(System.out::println);
    }

    @Test
    public void testFindByIdIn(){
        personService.findByIdIn(1).forEach(System.out::println);
    }
    @Test
    public void testFindByIdBetween(){
        personService.findByIdBetween(1, 2).forEach(System.out::println);
    }

    @Test
    public void testFindByIdInOrderByIdDesc(){
        personService.findByIdInOrderByIdDesc(1,2).forEach(System.out::println);
    }

} 
