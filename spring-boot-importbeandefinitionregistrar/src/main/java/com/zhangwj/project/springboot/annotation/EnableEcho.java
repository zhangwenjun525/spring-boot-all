package com.zhangwj.project.springboot.annotation;

import com.zhangwj.project.springboot.importbeandefinitionregistrar.EchoImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 17:44
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(EchoImportBeanDefinitionRegistrar.class)
public @interface EnableEcho {
    String[] packages();
}
