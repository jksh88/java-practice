package com.example.myPackage;

import org.w3c.dom.ls.LSOutput;

public class StaticInitializationBlockTest {
    public static final String owner;

    static {
        owner = "Jim";
        System.out.println("StaticInitializationBlock called");
    }

    public StaticInitializationBlockTest() {
        System.out.println("StaticInitializationBlock constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("SomeMethod called");
    }
}
