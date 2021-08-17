package com.dannykudinov.spring;

public class Person {
    private Pet pet;
    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("class Person: set age");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Person(){
        System.out.println("Default constructor: Person bean is created");
    }

//    public Person(Pet pet){
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public void setPet(Pet pet){
        System.out.println("Class Person set Pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
