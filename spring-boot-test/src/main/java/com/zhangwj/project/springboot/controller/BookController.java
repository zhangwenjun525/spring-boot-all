package com.zhangwj.project.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/12
 * Time: 16:54
 */
@RequestMapping(value = "/book")
@RestController
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(BookController.class);


    @GetMapping("/home")
    public String home() {
        log.info("/book/home url is invoke");
        return "book home";
    }

    @GetMapping("/show")
    public String show(@RequestParam(value = "id")String id){
        log.info(String.format("/book/show url is invoke , param:[%s]", id));
        return "book show id is " + id;
    }
}
