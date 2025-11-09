package com.example.access;

public class Student extends Person {
    public Student(String name, int age, String password) {
        super(name, age, password);
    }

    public void showStudentInfo() {
        // password is private, cannot access it directly
        System.out.println("Student: " + name + ", Age: " + age);
    }
}
