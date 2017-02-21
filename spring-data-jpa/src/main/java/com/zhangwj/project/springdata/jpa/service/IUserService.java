package com.zhangwj.project.springdata.jpa.service;

import com.zhangwj.project.springdata.jpa.domain.User;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 10:24
 */
public interface IUserService {

    void add(User user);

    void update(User user);

    User findOne(Integer id);
}
