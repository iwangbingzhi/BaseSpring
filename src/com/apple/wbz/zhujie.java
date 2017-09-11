package com.apple.wbz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 王炳智 on 2017/8/21.
 */
public class zhujie {
    public void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();
}
}
