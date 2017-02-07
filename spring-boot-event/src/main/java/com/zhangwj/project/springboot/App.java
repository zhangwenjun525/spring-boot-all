package com.zhangwj.project.springboot;

import com.zhangwj.project.springboot.event.MyEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 16:09
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        //方法一
        //application.addListeners(new MyListener());
        ConfigurableApplicationContext context = application.run(args);
        context.publishEvent(new MyEvent(new Object(), "hello world"));
    }
}
