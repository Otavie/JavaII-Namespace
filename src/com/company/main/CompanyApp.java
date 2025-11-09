// File: src/com/company/main/CompanyApp.java
package com.company.main;

import com.company.model.*;

public class CompanyApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 85000, 5);
        Developer dev = new Developer("Bob", 60000, "Java");

        manager.work();
        manager.conductMeeting();

        dev.work();
        System.out.println("Salary: $" + dev.getSalary());
    }
}
