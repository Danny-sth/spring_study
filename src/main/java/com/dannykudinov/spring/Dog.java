package com.dannykudinov.spring;

public class Dog implements Pet {

    @Override
    public void say() {
        System.out.printf("Bow-Wow");
    }
}
