package com.zhangwj.project.springdata.jpa.repository.impl;

import com.zhangwj.project.springdata.jpa.domain.User;
import com.zhangwj.project.springdata.jpa.repository.AddRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 11:05
 */
public class UserRepositoryImpl implements AddRepository<User> {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    @Override
    public void add(User obj) {
        entityManager.persist(obj);
    }
}
