package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.App;
import com.zhangwj.project.springdata.jpa.domain.Book;
import com.zhangwj.project.springdata.jpa.service.IBookService;
import com.zhangwj.project.springdata.jpa.service.IPersonService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookServiceTest {

    private IBookService bookService;

    @Before
    public void before() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
        bookService = applicationContext.getBean(IBookService.class);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: findOne(Book book)
     */
    @Test
    public void testFindOne() throws Exception {
        Book book = new Book();
        book.setId(1);
        System.out.println(bookService.findOne(book));
    }

    @Test
    public void testFindByAuthor(){
        System.out.println(bookService.findByAuthor("文"));
    }

} 
