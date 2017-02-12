package com.zhangwj.project.springboot.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/12
 * Time: 13:57
 */
@Component
public class User {

    private static final Logger log = LoggerFactory.getLogger(User.class);


    public void log(){
        log.trace("trace log");
        log.debug("debug log");
        log.info("info log");
        log.error("error log");
    }

}
