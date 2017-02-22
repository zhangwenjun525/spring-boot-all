package com.zhangwj.project.springdata.jpa.service;

import com.zhangwj.project.springdata.jpa.domain.Employee;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.LockModeType;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 22:22
 */
public interface IEmployeeService {

    Employee save(Employee employee);

    @Lock(LockModeType.OPTIMISTIC)
    Employee findOne(Integer id);

    @Transactional(rollbackFor = Exception.class)
    Employee getById(Integer id);

}
