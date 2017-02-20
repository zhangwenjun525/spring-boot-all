package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.App;
import com.zhangwj.project.springdata.jpa.domain.Goods;
import com.zhangwj.project.springdata.jpa.domain.Order;
import com.zhangwj.project.springdata.jpa.service.IGoodsService;
import com.zhangwj.project.springdata.jpa.service.IIdCardService;
import com.zhangwj.project.springdata.jpa.service.IOrderService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class OrderServiceTest {

    private IOrderService orderService;

    private IGoodsService goodsService;

    @Before
    public void before() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        orderService = applicationContext.getBean(IOrderService.class);
        goodsService = applicationContext.getBean(IGoodsService.class);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: save(Order order)
     */
    @Test
    public void testSave() throws Exception {

        Goods goods1 = new Goods();
        goods1.setName("商品1");
        goodsService.save(goods1);

        Goods goods2 = new Goods();
        goods2.setName("商品2");
        goodsService.save(goods2);

        Goods goods3 = new Goods();
        goods3.setName("商品3");
        goodsService.save(goods3);


        Order order = new Order();
        order.setGoodses(Arrays.asList(goods1, goods2, goods3));
        orderService.save(order);
    }


    @Test
    public void testFindById(){
        Order order = orderService.findById(1);
        System.out.println(order);
    }

    @Test
    public void testFindGoodsById(){
        Goods goods = goodsService.findById(1);
        System.out.println(goods);
    }
} 
