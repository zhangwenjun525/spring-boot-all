package com.zhangwj.project.springboot.operate;

import com.zhangwj.project.springboot.properties.MemcacheProperties;
import net.rubyeye.xmemcached.KeyIterator;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeoutException;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/10
 * Time: 15:48
 */
@Component
public class MemcacheOperate {

    @Autowired
    MemcacheProperties memcacheProperties;

    @Autowired
    MemcachedClient memcachedClient;

    public Set<String> getKeys(String ... prefix) throws InterruptedException, MemcachedException, TimeoutException {
        Set<String> set = new HashSet<>();
        KeyIterator keyIterator = memcachedClient.getKeyIterator(new InetSocketAddress(memcacheProperties.getServer(), memcacheProperties.getPort()));
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            if(prefix.length > 0){
                for(String p : prefix){
                    if(key.startsWith(p)){
                        set.add(key);
                        continue;
                    }
                }
            }else{
                set.add(key);
            }
        }
        return set;
    }

    public void deleteKeys(Set<String> keys) throws InterruptedException, MemcachedException, TimeoutException {
        if(keys == null || keys.size() == 0){
            return;
        }
        for(String key : keys){
            memcachedClient.delete(key);
        }
    }


}
