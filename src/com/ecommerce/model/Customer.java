// File: src/com/ecommerce/model/Customer.java
package com.ecommerce.model;

public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
}
