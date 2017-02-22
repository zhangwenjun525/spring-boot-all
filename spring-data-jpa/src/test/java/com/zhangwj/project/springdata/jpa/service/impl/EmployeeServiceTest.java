package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.App;
import com.zhangwj.project.springdata.jpa.domain.Employee;
import com.zhangwj.project.springdata.jpa.service.IEmployeeService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 22:24
 */
public class EmployeeServiceTest {

    private IEmployeeService employeeService;

    @Before
    public void before() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        employeeService = applicationContext.getBean(IEmployeeService.class);
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testSave(){
        Employee employee = new Employee();
        employee.setName("章文君");
        employee.setSalary(18000.00);
        employeeService.save(employee);
    }

    @Test
    public void testFindAndSave() throws InterruptedException {
        Employee employee = employeeService.findOne(1);
        System.out.println(employee);
        TimeUnit.SECONDS.sleep(10);
        employee.setSalary(20000.0);
        employeeService.save(employee);
    }

    @Test
    public void testFindById(){
        System.out.println(employeeService.getById(1));
    }

}
