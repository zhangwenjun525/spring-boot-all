package com.zhangwj.project.springboot.bean;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/12
 * Time: 16:40
 */
@Component
public class UserMapper {

    public Integer addUser(String username){
        if(username == null){
            throw new NullPointerException();
        }

        if(StringUtils.isEmpty(username.trim())){
            return 0;
        }
        return 1;
    }

}
