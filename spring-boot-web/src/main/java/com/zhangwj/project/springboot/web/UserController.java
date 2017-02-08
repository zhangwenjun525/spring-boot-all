package com.zhangwj.project.springboot.web;

import org.springframework.web.bind.annotation.*;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/8
 * Time: 15:33
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/home")
    public String home() {
        return "user home";
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "user hello";
    }

    @PostMapping(value = "/create")
    public String create(@RequestParam(value = "username", required = false, defaultValue = "admin")String username,
                         @RequestParam(value = "password", required = false, defaultValue = "admin123")String password){
        return String.format("username:[%s], password:[%s]", username, password);
    }




}
