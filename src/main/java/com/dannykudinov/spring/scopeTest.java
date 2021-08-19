package com.dannykudinov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3");
        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();
//        Dog yourDog = context.getBean("dog", Dog.class);
//        System.out.println(myDog == yourDog);
    context.close();
    }
}
