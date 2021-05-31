package com.example.myPackage;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
    }

//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
