package com.zhangwj.project.springdata.jpa.repository;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 11:01
 */
public interface AddRepository<T> {

    void add(T obj);
}
