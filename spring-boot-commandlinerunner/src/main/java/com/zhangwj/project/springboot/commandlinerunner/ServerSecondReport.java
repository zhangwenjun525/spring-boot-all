package com.zhangwj.project.springboot.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/8
 * Time: 0:10
 */
@Order(2)
@Component
public class ServerSecondReport implements CommandLineRunner{
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("====================2===============");
    }
}
