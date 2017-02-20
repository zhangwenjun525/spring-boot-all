package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.domain.IdCard;
import com.zhangwj.project.springdata.jpa.repository.IdCardRepository;
import com.zhangwj.project.springdata.jpa.service.IIdCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/19
 * Time: 12:06
 */
@Service("idCardService")
public class IdCardService implements IIdCardService {

    @Autowired
    private IdCardRepository idCardRepository;

    @Override
    public IdCard findById(Integer id) {
      return idCardRepository.findOne(id);
    }
}
