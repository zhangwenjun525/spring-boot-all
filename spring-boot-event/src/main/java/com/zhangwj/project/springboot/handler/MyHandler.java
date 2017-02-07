package com.zhangwj.project.springboot.handler;

import com.zhangwj.project.springboot.event.MyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 16:20
 */
//方法四
//@Component
public class MyHandler {

    @EventListener
    public void handleEvent(MyEvent event){
        System.out.println("接收事件: " + event.getMsg());
    }

}
