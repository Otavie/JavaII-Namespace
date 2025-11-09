// File: src/com/company/model/Manager.java
package com.company.model;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing a team of " + teamSize + " employees.");
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }
}
