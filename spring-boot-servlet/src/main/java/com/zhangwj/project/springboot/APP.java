package com.zhangwj.project.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/8
 * Time: 22:29
 */
@ServletComponentScan
@SpringBootApplication
public class APP {

    public static void main(String[] args) {
        SpringApplication.run(APP.class, args);
    }
}
