package com.zhangwj.project.springboot;

import com.zhangwj.project.springboot.annotation.EnableRedis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/9
 * Time: 23:43
 */
@EnableRedis
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        ConfigurableApplicationContext context = application.run(args);
        Jedis jedis = context.getBean(Jedis.class);
        jedis.set("id","zhangwj");
        System.out.println(jedis.get("id"));
    }
}
