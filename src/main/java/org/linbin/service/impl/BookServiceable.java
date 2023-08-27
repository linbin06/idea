package org.linbin.service.impl;

import org.linbin.dao.BookDao;
import org.linbin.service.BookService;

public class BookServiceable implements BookService {
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao){
        this.bookDao=bookDao;
    }
    public void save() {
        System.out.println("book service sava");
        bookDao.save();
    }
}
