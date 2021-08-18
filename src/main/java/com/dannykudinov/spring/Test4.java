package com.dannykudinov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2");
        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Jessy");
        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Chappi");
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
        System.out.println("Переменные ссылаются на один и тот же обьект? " + (myDog == yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);

    }
}
