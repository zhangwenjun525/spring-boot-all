package com.zhangwj.project.springdata.jpa.service;

import com.zhangwj.project.springdata.jpa.domain.Order;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/20
 * Time: 17:10
 */
public interface IOrderService {

    Order save(Order order);

    Order findById(Integer id);
}
