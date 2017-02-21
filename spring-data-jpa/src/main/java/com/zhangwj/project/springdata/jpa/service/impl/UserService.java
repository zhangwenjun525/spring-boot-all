package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.domain.User;
import com.zhangwj.project.springdata.jpa.repository.UserRepository;
import com.zhangwj.project.springdata.jpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 10:25
 */
@Service("userService")
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void add(User user) {
        userRepository.add(user);
    }

    @Override
    public void update(User user) {
        userRepository.update(user);
    }

    @Override
    public User findOne(Integer id) {
        return  userRepository.findOne(id);
    }
}
