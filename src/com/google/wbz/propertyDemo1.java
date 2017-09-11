package com.google.wbz;

/**
 * Created by 王炳智 on 2017/8/20.
 */
public class propertyDemo1 {
    public propertyDemo1(String username) {
        this.username = username;
    }

    private String username;

    public void test1(){
        System.out.println("demo1........"+username);
    }
}
