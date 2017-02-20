package com.zhangwj.project.springdata.jpa.service;

import com.zhangwj.project.springdata.jpa.domain.IdCard;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/19
 * Time: 12:05
 */
public interface IIdCardService {

    IdCard findById(Integer id);

}
