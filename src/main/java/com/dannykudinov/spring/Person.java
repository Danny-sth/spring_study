package com.dannykudinov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component("personBean")
public class Person {

    public Person() {
        System.out.println("Default constructor: Person bean is created");
    }

//@Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    private Pet pet;
    private String surname;
    private int age;


    public String getSurname() {
        return surname;
    }

        @Value("${person.surname}")
    public void setSurname(String surname) {
        System.out.println("class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    @Value("${person.age}")
    public void setAge(int age) {
        System.out.println("class Person: set age");
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
