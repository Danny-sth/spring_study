package com.dannykudinov.spring;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.printf("Meow-Meow");
    }
}
