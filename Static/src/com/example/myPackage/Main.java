package com.example.myPackage;

public class Main {

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("first Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());

        StaticTest secondInstance = new StaticTest("second Instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());

        StaticTest thirdInstance = new StaticTest("third Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getNumInstances());


    }
}
