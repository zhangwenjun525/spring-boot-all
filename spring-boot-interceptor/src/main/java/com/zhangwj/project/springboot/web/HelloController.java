package com.zhangwj.project.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/8
 * Time: 22:57
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        System.out.println("=========================00");
        return "hello";
    }

}
