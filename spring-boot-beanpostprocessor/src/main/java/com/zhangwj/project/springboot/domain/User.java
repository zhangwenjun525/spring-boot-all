package com.zhangwj.project.springboot.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 16:51
 */
@Component
public class User {

    @PostConstruct
    public void init(){
        System.out.println("bean init...");
    }

}
