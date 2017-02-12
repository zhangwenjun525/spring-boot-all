package com.zhangwj.project.springboot.annotation;

import com.zhangwj.project.springboot.configuration.MemcacheAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/10
 * Time: 14:25
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MemcacheAutoConfiguration.class)
public @interface EnableMemcache {
}
