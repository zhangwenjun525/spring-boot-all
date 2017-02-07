package com.zhangwj.project.springboot.importbeandefinitionregistrar;

import com.zhangwj.project.springboot.annotation.EnableEcho;
import com.zhangwj.project.springboot.beanpostprocessor.EchoBeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 17:45
 */
public class EchoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        //1.获取注解中的package属性
        Map<String, Object> attributes = annotationMetadata.getAnnotationAttributes(EnableEcho.class.getName());
        String[] packAttr = (String[]) attributes.get("packages");
        List<String> packages = Arrays.asList(packAttr);

        //2.注册BeanPostProcessor对象
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(EchoBeanPostProcessor.class);
        builder.addPropertyValue("packages", packages);
        beanDefinitionRegistry.registerBeanDefinition(EchoBeanPostProcessor.class.getName(), builder.getBeanDefinition());
    }
}
