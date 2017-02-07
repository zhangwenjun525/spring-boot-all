package com.zhangwj.project.springboot;

import com.zhangwj.project.springboot.configurationproperties.TomcatProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 16:59
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        ConfigurableApplicationContext context = application.run(args);
        System.out.println(context.getBean(TomcatProperties.class));
    }
}
