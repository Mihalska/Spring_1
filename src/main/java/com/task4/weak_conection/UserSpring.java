package com.task4.weak_conection;


import com.task4.weak_conection.impl.UserFirst;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext4.xml");

        UserFirst userFirst = context.getBean("userFirst", UserFirst.class);
        System.out.println("User:" );
        userFirst.giveDescription();
        context.close();
    }
}
