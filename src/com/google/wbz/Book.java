package com.google.wbz;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created by 王炳智 on 2017/8/20.
 */
public class Book {
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    private String bookname;
    public void test(){
        System.out.println("Book......"+bookname);
    }

}
