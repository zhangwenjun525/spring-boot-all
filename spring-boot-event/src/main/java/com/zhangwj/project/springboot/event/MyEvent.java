package com.zhangwj.project.springboot.event;

import org.springframework.context.ApplicationEvent;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/7
 * Time: 16:11
 */
public class MyEvent extends ApplicationEvent {

    private String msg;

    public MyEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
