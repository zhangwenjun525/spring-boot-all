package com.zhangwj.project.springdata.jpa;

import com.zhangwj.project.springdata.jpa.domain.Person;
import com.zhangwj.project.springdata.jpa.service.IPersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/16
 * Time: 14:45
 */
@ComponentScan
@EnableJpaRepositories
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
    }
}
