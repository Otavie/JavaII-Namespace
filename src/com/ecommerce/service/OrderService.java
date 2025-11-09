// File: src/com/ecommerce/service/OrderService.java
package com.ecommerce.service;

import com.ecommerce.model.Customer;
import com.ecommerce.model.Product;

public class OrderService {
    public void placeOrder(Customer customer, Product product) {
        System.out.println(customer.getName() + " ordered: " + product.getName() + " ($" + product.getPrice() + ")");
    }
}
