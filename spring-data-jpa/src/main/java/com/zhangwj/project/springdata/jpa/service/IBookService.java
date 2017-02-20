package com.zhangwj.project.springdata.jpa.service;

import com.zhangwj.project.springdata.jpa.domain.Book;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/17
 * Time: 23:34
 */
public interface IBookService {

    Book findOne(Book book);

    Book findByAuthor(String author);

}
