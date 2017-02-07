package com.zhangwj.project.springboot.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 17:01
 */
@Component
@ConfigurationProperties(prefix = "tomcat")
public class TomcatProperties {

    private String host;

    private String port;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "TomcatProperties{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
