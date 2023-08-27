package org.linbin;

import org.linbin.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        context.registerShutdownHook();
        BookDao bookDao= (BookDao) context.getBean("bookDao");
        bookDao.save();

        System.out.println(123);
        context.close();
    }
}
