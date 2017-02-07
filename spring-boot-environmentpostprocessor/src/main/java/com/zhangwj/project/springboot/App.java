package com.zhangwj.project.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 17:20
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        ConfigurableApplicationContext context = application.run(args);
        ConfigurableEnvironment environment = context.getEnvironment();
        String value = environment.getProperty("springboot.test");
        System.out.println(value);
    }

}
