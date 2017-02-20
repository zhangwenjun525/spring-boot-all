package com.zhangwj.project.springdata.jpa.service;

import com.zhangwj.project.springdata.jpa.domain.Student;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/19
 * Time: 14:29
 */
public interface IStudentService {

    Student save(Student student);

    Student findById(Integer id);

}
