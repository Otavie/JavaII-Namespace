// File: src/com/bank/main/Main.java
package com.bank.main;

import com.bank.model.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("12345", "John Doe", 5000.00);
        acc1.deposit(1500);
        acc1.withdraw(2000);
        System.out.println("Final Balance for " + acc1.getAccountHolder() + ": $" + acc1.getBalance());
    }
}
