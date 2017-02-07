package com.zhangwj.project.springboot.environmentpostprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 17:21
 */
@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment configurableEnvironment, SpringApplication springApplication) {
        try(InputStream in = new FileInputStream("e:/springboot.properties");
        ){
            Properties source = new Properties();
            source.load(in);
            PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("my", source);
            configurableEnvironment.getPropertySources().addLast(propertiesPropertySource);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
