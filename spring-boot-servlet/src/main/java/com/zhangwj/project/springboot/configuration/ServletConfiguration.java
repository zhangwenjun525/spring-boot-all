package com.zhangwj.project.springboot.configuration;

import com.zhangwj.project.springboot.filter.UserFilter;
import com.zhangwj.project.springboot.servlet.UserServlet;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/8
 * Time: 22:38
 */
@SpringBootConfiguration
public class ServletConfiguration {

    @Bean
    public ServletRegistrationBean userServlet() {
        return new ServletRegistrationBean(new UserServlet(), "/user.do");
    }

    @Bean
    public FilterRegistrationBean userFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new UserFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/user.do"));
        return filterRegistrationBean;
    }
}
