package com.zhangwj.project.springboot;

import com.zhangwj.project.springboot.domain.Role;
import com.zhangwj.project.springboot.domain.User;
import com.zhangwj.project.springboot.importselector.MyImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 17:31
 */
@SpringBootApplication
@Import(MyImportSelector.class)
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        ConfigurableApplicationContext context = application.run(args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Role.class));
    }
}
