// File: src/com/ecommerce/main/ECommerceApp.java
package com.ecommerce.main;

import com.ecommerce.model.*;
import com.ecommerce.service.OrderService;

public class ECommerceApp {
    public static void main(String[] args) {
        Customer c1 = new Customer("John", "john@example.com");
        Product p1 = new Product("Laptop", 1200.00);

        OrderService orderService = new OrderService();
        orderService.placeOrder(c1, p1);
    }
}
