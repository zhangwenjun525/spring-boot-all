package com.zhangwj.project.springboot.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/8
 * Time: 0:04
 */
@Order(1)
@Component
public class ServerSuccessReport implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("====================1===============");
    }
}
