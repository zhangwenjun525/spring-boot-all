package com.zhangwj.project.springdata.jpa.service;

import com.zhangwj.project.springdata.jpa.domain.Goods;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/20
 * Time: 17:08
 */
public interface IGoodsService {

    Goods save(Goods goods);

    Goods findById(Integer id);

}
