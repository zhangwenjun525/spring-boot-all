package com.zhangwj.project.springboot.beanpostprocessor;

import com.zhangwj.project.springboot.domain.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 16:44
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        super();
        System.out.println("这是BeanPostProcessor实现类构造器！！");
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if(o instanceof User){
            System.out.println("bean处理器：bean创建之前..");
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if(o instanceof User){
            System.out.println("bean处理器：bean创建之后..");
        }
        return o;
    }
}
