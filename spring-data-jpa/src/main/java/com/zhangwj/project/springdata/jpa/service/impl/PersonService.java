package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.domain.Address;
import com.zhangwj.project.springdata.jpa.domain.Person;
import com.zhangwj.project.springdata.jpa.repository.PersonRepository;
import com.zhangwj.project.springdata.jpa.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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

    @Autowired
    private EntityManager entityManager;


    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person findById(Integer id) {
        //return personRepository.findOne(id);
        Query query = entityManager.createQuery("SELECT p FROM Person p where p.id = :id");
        query.setParameter("id", id);
        return (Person) query.getSingleResult();
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

    @Override
    public List<Person> list() {
        return personRepository.list();
    }

    @Override
    public List<Person> takeByName(String name) {
        return personRepository.takeByName(name);
    }

    @Override
    public Integer updatePerson(Integer id, String name) {
        return personRepository.updatePerson(id, name);
    }

    @Override
    public List<Person> byName(String name) {
        return personRepository.byName(name);
    }

    @Override
    public List<Person> byNameNative(String name) {
        return personRepository.byNameNative(name);
    }

    @Override
    public List<Person> byNameNative2(String name) {
        return personRepository.byNameNative2(name);
    }

    @Override
    public List<Address> findAddress() {
        return personRepository.findAddress();
    }

    @Override
    public List<Person> queryAll() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> query = cb.createQuery(Person.class);
        Root<Person> root = query.from(Person.class);
        query.orderBy(cb.desc(root.get("id")));
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Person byId(Integer id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> query = cb.createQuery(Person.class);
        Root<Person> root = query.from(Person.class);
        query.where(cb.equal(root.get("id"), id));
        return entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public List<Person> byPerson(Person person) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> query = cb.createQuery(Person.class);
        Root<Person> root = query.from(Person.class);
        Predicate predicate = null;
        if(person.getId() != null){
           predicate = cb.equal(root.get("id"), person.getId());
        }
        if(!StringUtils.isEmpty(person.getName())){
           predicate = (predicate != null ? cb.and(predicate, cb.equal(root.get("name"), person.getName())) : cb.equal(root.get("name"), person.getName()));
        }
        query.where(predicate);
        return entityManager.createQuery(query).getResultList();
    }
}
