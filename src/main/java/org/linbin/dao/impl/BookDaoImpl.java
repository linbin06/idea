package org.linbin.dao.impl;

import org.linbin.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println(" book dao save");
    }


        public void init() {
            System.out.println("init");
        }


        public void destroy(){
            System.out.println("destroy");
        }


}
