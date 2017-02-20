package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.domain.Human;
import com.zhangwj.project.springdata.jpa.repository.HumanRepository;
import com.zhangwj.project.springdata.jpa.service.IHumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/19
 * Time: 11:03
 */
@Service("humanService")
public class HumanService implements IHumanService {

    @Autowired
    private HumanRepository humanRepository;

    @Override
    public Human save(Human human) {
        return humanRepository.save(human);
    }

    @Override
    public Human findById(Integer id) {
        return humanRepository.findOne(id);
    }
}
