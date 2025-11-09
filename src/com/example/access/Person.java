package com.example.access;

public class Person {
    public String name;       // Accessible everywhere
    protected int age;        // Accessible in same package and subclasses
    private String password;  // Only accessible within Person class

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
