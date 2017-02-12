package com.zhangwj.project.springboot;

import com.zhangwj.project.springboot.operate.MemcacheOperate;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;
import java.util.concurrent.TimeoutException;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/10
 * Time: 14:26
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) throws InterruptedException, MemcachedException, TimeoutException {
        SpringApplication application = new SpringApplication(App.class);
        ConfigurableApplicationContext context = application.run(args);
        MemcacheOperate operate = context.getBean(MemcacheOperate.class);
        Set<String> keys = operate.getKeys("user_id_", "user_mobile_");
        operate.deleteKeys(keys);
    }
}
