package com.zhangwj.project.springdata.jpa.listener;

import com.zhangwj.project.springdata.jpa.domain.User;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 11:42
 */
public class UserListeren {

    @PrePersist
    public void prePersist(User user){
        user.setCreateTime(new Date());
    }

    @PreUpdate
    public void preUpdate(User user){
        user.setUpdateTime(new Date());
    }
}
