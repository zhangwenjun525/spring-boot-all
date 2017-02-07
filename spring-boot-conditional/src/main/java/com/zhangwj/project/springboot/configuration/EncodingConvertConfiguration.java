package com.zhangwj.project.springboot.configuration;

import com.zhangwj.project.springboot.condition.GBKCondition;
import com.zhangwj.project.springboot.condition.UTF8Condition;
import com.zhangwj.project.springboot.convert.EncodingConvert;
import com.zhangwj.project.springboot.convert.GBKEncodingConvert;
import com.zhangwj.project.springboot.convert.UTF8EncodingConvert;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 17:11
 */
@SpringBootConfiguration
public class EncodingConvertConfiguration {

    @Bean
    @Conditional(UTF8Condition.class)
    public EncodingConvert utf8EncodingConvert() {
        return new UTF8EncodingConvert();
    }

    @Bean
    @Conditional(GBKCondition.class)
    public EncodingConvert gbkEncodingConvert() {
        return new GBKEncodingConvert();
    }

}
