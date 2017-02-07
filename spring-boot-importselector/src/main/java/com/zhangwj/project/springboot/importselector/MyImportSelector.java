package com.zhangwj.project.springboot.importselector;

import com.zhangwj.project.springboot.domain.Role;
import com.zhangwj.project.springboot.domain.User;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 17:33
 */
public class MyImportSelector implements ImportSelector {

    //可以根据annotationMetadata的属性值判断需要加载那些类
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{User.class.getName(), Role.class.getName()};
    }
}
