package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.domain.Person;
import com.zhangwj.project.springdata.jpa.repository.PersonRepository;
import com.zhangwj.project.springdata.jpa.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/16
 * Time: 15:31
 */
@Service("personService")
public class PersonService implements IPersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person findById(Integer id) {
        return personRepository.findOne(id);
    }

    @Override
    public Page<Person> findAll(int page, int size) {
        return personRepository.findAll(new PageRequest(page, size));
    }

    @Override
    public List<Person> findByName(String name) {
        return personRepository.findByName(name);
    }

    @Override
    public List<Person> findByIdIn(Integer... ids) {
        return personRepository.findByIdIn(ids);
    }

    @Override
    public List<Person> findByIdBetween(Integer left, Integer right) {
        return personRepository.findByIdBetween(left, right);
    }

    @Override
    public List<Person> findByIdInOrderByIdDesc(Integer... ids) {
        return personRepository.findByIdInOrderByIdDesc(ids);
    }
}
