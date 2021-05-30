package com.example.myPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " has been deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Deposit amount cannot be negative.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            transactions.add(-amount);
            this.balance -= amount;
            System.out.println(amount + " has been withdrawn. Balance is now " + this.balance);
        } else {
            System.out.println("Amount cannot be negative.");
        }
    }

    public int calculateBalance() {
        this.balance = 0;
        for (int t: transactions) {
            balance += t;
        }
        System.out.println(getAccountName() + " Current balance: " + this.balance);
        return this.balance;
    }
}
