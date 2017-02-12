package com.zhangwj.project.springboot.bean;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/12
 * Time: 15:55
 */
@Component
public class UserDao {

    public Integer addUser(String username){
        if(StringUtils.isEmpty(username)){
            return 0;
        }
        return 1;
    }

}
