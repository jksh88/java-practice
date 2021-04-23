package com.jk;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println('\u00A9');
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOver21 = true;

        String myString = "This is a string";
        myString = "Changed content";
        //String is immutalbe in java. myString's value hasn't changed. A new string has been created and the old one got discarded.
        System.out.println(myString + " and is that's it");
        System.out.println("2021" + '\u00A9');
        String numString = "50";
        int num = 20;
        System.out.println(numString + num);

    }
}
