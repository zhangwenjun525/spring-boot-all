package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.domain.Book;
import com.zhangwj.project.springdata.jpa.repository.BookRepository;
import com.zhangwj.project.springdata.jpa.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/17
 * Time: 23:34
 */
@Service("bookService")
public class BookService implements IBookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public Book findOne(Book book) {
        return bookRepository.findOne(Example.of(book));
    }

    @Override
    public Book findByAuthor(String author) {
        Book book = new Book();
        book.setAuthor(author);
        return bookRepository.findOne(Example.of(book, ExampleMatcher.matching().withMatcher("author", ExampleMatcher.GenericPropertyMatcher.of(ExampleMatcher.StringMatcher.CONTAINING))));
        //return  bookRepository.findOne(Example.of(book, ExampleMatcher.matching().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)));
    }
}
