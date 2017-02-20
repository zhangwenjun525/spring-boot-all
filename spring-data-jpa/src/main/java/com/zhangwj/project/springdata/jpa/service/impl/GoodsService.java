package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.domain.Goods;
import com.zhangwj.project.springdata.jpa.repository.GoodesRepository;
import com.zhangwj.project.springdata.jpa.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/20
 * Time: 17:09
 */
@Service("goodsService")
public class GoodsService implements IGoodsService {

    @Autowired
    private GoodesRepository goodesRepository;

    @Override
    public Goods save(Goods goods) {
        return goodesRepository.save(goods);
    }

    @Transactional(readOnly = true)
    @Override
    public Goods findById(Integer id) {
        Goods goods = goodesRepository.findOne(id);
        goods.getOrders().forEach(System.out::println);
        return goods;
    }
}
