package com.dannykudinov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2");
        Dog jessy = context.getBean("myPet", Dog.class);
        jessy.say();
//        Dog chappi = context.getBean("myPet", Dog.class);
//        chappi.say();
        context.close();
    }
}
