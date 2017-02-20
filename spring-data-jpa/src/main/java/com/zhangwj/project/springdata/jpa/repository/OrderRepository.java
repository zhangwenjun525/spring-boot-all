package com.zhangwj.project.springdata.jpa.repository;

import com.zhangwj.project.springdata.jpa.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/20
 * Time: 17:07
 */
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
