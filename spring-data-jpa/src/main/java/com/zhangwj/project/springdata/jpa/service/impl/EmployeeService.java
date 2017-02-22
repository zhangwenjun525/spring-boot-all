package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.domain.Employee;
import com.zhangwj.project.springdata.jpa.repository.EmployeeRepository;
import com.zhangwj.project.springdata.jpa.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import java.util.concurrent.TimeUnit;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 22:23
 */
@Service("employeeService")
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findOne(Integer id) {
        return employeeRepository.findOne(id);
    }


    @Override
    public Employee getById(Integer id) {
        Employee employee =  employeeRepository.findById(id); //employeeRepository.findOne(id);
        return employee;
    }
}
