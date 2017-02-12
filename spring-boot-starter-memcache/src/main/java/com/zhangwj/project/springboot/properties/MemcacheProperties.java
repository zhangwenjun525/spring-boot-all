package com.zhangwj.project.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/10
 * Time: 14:16
 */
@ConfigurationProperties(prefix = "memcache")
public class MemcacheProperties {

    private String server;
    private Integer port;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "MemcacheProperties{" +
                "server='" + server + '\'' +
                ", port=" + port +
                '}';
    }
}
