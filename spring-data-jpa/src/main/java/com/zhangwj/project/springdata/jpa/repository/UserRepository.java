package com.zhangwj.project.springdata.jpa.repository;

import com.zhangwj.project.springdata.jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 10:26
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    void add(User user);

    void update(User user);
}
