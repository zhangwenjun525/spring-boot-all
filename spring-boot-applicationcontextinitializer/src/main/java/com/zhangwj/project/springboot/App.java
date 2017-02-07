package com.zhangwj.project.springboot;

import com.zhangwj.project.springboot.applicationcontextinitializer.MyApplicationContextInititializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 22:00
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        //方法1：使用SpringApplication.addInitializers进行注册
        //application.addInitializers(new MyApplicationContextInititializer());
        ConfigurableApplicationContext context = application.run(args);
    }

}
