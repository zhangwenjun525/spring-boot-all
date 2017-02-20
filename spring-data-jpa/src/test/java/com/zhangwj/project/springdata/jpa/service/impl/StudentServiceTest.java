package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.App;
import com.zhangwj.project.springdata.jpa.domain.School;
import com.zhangwj.project.springdata.jpa.domain.Student;
import com.zhangwj.project.springdata.jpa.service.ISchoolService;
import com.zhangwj.project.springdata.jpa.service.IStudentService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentServiceTest {
    private IStudentService studentService;
    private ISchoolService schoolService;

    @Before
    public void before() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        studentService = applicationContext.getBean(IStudentService.class);
        schoolService = applicationContext.getBean(ISchoolService.class);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: save(Student student)
     */
    @Test
    public void testSave() throws Exception {

        School school = new School();
        school.setName("临川一中");
        school = schoolService.save(school);


        Student student = new Student();
        student.setName("章文君");
        student.setAge(27);
        student.setSchool(school);
        studentService.save(student);

    }

    @Test
    public void testFindById(){
        Student student = studentService.findById(1);
        System.out.println(student);
    }




} 
