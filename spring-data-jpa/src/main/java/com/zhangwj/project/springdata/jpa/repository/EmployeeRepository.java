package com.zhangwj.project.springdata.jpa.repository;

import com.zhangwj.project.springdata.jpa.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import javax.persistence.LockModeType;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 22:22
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Lock(LockModeType.PESSIMISTIC_READ)
    Employee findById(Integer id);

}
