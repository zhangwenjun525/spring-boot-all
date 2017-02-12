package com.zhangwj.project.springboot.configuration;

import com.zhangwj.project.springboot.properties.MemcacheProperties;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.XMemcachedClient;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/10
 * Time: 14:17
 */
@SpringBootConfiguration
@ConditionalOnClass(XMemcachedClient.class)
@EnableConfigurationProperties(MemcacheProperties.class)
public class MemcacheAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MemcachedClient memcachedClient(MemcacheProperties properties) throws IOException {
         MemcachedClient memcachedClient = new XMemcachedClient(properties.getServer(), properties.getPort());
         return  memcachedClient;
    }






}
