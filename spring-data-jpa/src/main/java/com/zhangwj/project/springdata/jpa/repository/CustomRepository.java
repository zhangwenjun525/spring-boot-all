package com.zhangwj.project.springdata.jpa.repository;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.io.Serializable;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 10:17
 */
public class CustomRepository<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> {

    private EntityManager entityManager;

    public CustomRepository(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    public CustomRepository(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.entityManager = em;
    }

    @Transactional
    public void add(T obj){
        entityManager.persist(obj);
    }

    @Transactional
    public void update(T obj){
        entityManager.merge(obj);
    }

}
