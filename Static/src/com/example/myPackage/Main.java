package com.example.myPackage;

public class Main {
    public static int multiplier = 8;


    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("first Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("second Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("third Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        int answer = multiply(6);
        System.out.println("answer: " + answer);
        }
    public static int multiply(int number) {
        return number * multiplier;

    }
}
