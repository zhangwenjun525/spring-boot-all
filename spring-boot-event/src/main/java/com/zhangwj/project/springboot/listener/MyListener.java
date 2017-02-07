package com.zhangwj.project.springboot.listener;

import com.zhangwj.project.springboot.event.MyEvent;
import org.springframework.context.ApplicationListener;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 16:12
 */
//方法二:将将监听对象添加到spring容器中
//@Component
public class MyListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("接收事件: " + myEvent.getMsg());
    }
}
