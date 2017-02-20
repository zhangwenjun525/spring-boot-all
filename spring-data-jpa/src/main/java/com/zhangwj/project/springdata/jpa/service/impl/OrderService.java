package com.zhangwj.project.springdata.jpa.service.impl;

import com.sun.tools.corba.se.idl.constExpr.Or;
import com.zhangwj.project.springdata.jpa.domain.Order;
import com.zhangwj.project.springdata.jpa.repository.OrderRepository;
import com.zhangwj.project.springdata.jpa.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/20
 * Time: 17:11
 */
@Service("orderService")
public class OrderService implements IOrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Transactional(readOnly = true)
    @Override
    public Order findById(Integer id) {
        Order order = orderRepository.findOne(id);
        return order;
    }
}
