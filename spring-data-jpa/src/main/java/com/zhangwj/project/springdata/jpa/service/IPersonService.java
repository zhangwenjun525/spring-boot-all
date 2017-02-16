package com.zhangwj.project.springdata.jpa.service;

import com.zhangwj.project.springdata.jpa.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/16
 * Time: 15:30
 */
public interface IPersonService {

    Person save(Person person);

    Person findById(Integer id);

    Page<Person> findAll(int page, int size);

    List<Person> findByName(String name);

    List<Person> findByIdIn(Integer ... ids);

    List<Person> findByIdBetween(Integer left, Integer right);

    List<Person> findByIdInOrderByIdDesc(Integer ... ids);

    List<Person> list();

    List<Person> takeByName(String name);

    @Transactional
    Integer updatePerson(Integer id, String name);
}
