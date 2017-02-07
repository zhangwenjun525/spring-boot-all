package com.zhangwj.project.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 17:08
 */
public class GBKCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String encoding = System.getProperty("file.encoding");
        if(null != encoding){
            return "gbk".equalsIgnoreCase(encoding);
        }
        return false;
    }
}
