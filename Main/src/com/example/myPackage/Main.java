package com.example.myPackage;

public class Main {

    public static void main(String[] args) {
        Account jayAccount = new Account("jayAccount");
        jayAccount.deposit(200);
        jayAccount.deposit(1000);
        jayAccount.deposit(500);
        jayAccount.withdraw(800);
        jayAccount.calculateBalance();
//        jayAccount.balance = 5000;
        System.out.println("Balance by getBalance here: " + jayAccount.getBalance());
        jayAccount.calculateBalance();

    }


}
