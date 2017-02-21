package com.zhangwj.project.springdata.jpa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.domain.AuditorAware;

import java.util.Calendar;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 16:26
 */
@Configuration
public class AuditingConfiguration {

    /**
     * 用来返回创建者/修改者
     * @return
     */
    @Bean(name = "auditorAware")
    public AuditorAware<String> createAuditorAware(){
        return new AuditorAware<String>() {
            @Override
            public String getCurrentAuditor() {
                return "manager";
            }
        };
    }

    /**
     * 用来获取创建时间/修改时间
     * @return
     */
    @Bean(name = "dateTimeProvider")
    public DateTimeProvider createDateTimeProvider(){
        return new DateTimeProvider() {
            @Override
            public Calendar getNow() {
                return Calendar.getInstance();
            }
        };
    }
}
