package com.zhangwj.project.springboot.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.List;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 17:45
 */
public class EchoBeanPostProcessor implements BeanPostProcessor {

    private List<String> packages;

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        String className = o.getClass().getName();
        for(String pack : packages){
            if(className.startsWith(pack)){
                System.out.println("echo : " + o);
            }
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }

    public List<String> getPackages() {
        return packages;
    }

    public void setPackages(List<String> packages) {
        this.packages = packages;
    }
}
