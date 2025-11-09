// File: src/com/company/model/Developer.java
package com.company.model;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}
