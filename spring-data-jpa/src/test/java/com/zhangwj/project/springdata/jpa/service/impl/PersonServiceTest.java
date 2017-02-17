package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.App;
import com.zhangwj.project.springdata.jpa.domain.Person;
import com.zhangwj.project.springdata.jpa.service.IPersonService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
      personService.save(new Person("章文君", 27, "杭州"));
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

    @Test
    public void testList(){
        personService.list().forEach(System.out::println);
    }

    @Test
    public void testTakeByName(){
        personService.takeByName("章文君").forEach(System.out::println);
    }

    @Test
    public void testUpdataPerson(){
        personService.updatePerson(1,"李结红");
    }

    @Test
    public void testByName(){
        personService.byName("章文君").forEach(System.out::println);
    }

    @Test
    public void testByNameNative(){
        personService.byNameNative("章文君").forEach(System.out::println);
    }

    @Test
    public void testByNameNative2(){
        personService.byNameNative2("章文君").forEach(System.out::println);
    }

    @Test
    public void testFindAddress(){
        personService.findAddress().forEach(System.out::println);
    }

    @Test
    public void testQueryAll(){
        personService.queryAll().forEach(System.out::println);
    }

    @Test
    public void testById(){
        System.out.println(personService.byId(2));
    }

    @Test
    public void testByPerson(){
        Person person = new Person();
        person.setId(2);
        person.setName("章文君2");
        System.out.println(personService.byPerson(person));
    }

    @Test
    public void testByPerson2(){
        Person person = new Person();
        person.setId(1);
        System.out.println(personService.byPerson2(person));
    }
} 
