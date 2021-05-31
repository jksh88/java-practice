package com.example.myPackage;

public class Main {

    public static void main(String[] args) {
	    SomeClass firstInstance = new SomeClass("firstInstance");
	    int outcome1 = firstInstance.getClassCounter() ;
		SomeClass secondInstance = new SomeClass("secondInstance");
		SomeClass thirdInstance = new SomeClass("thirdInstance");
		System.out.println(firstInstance.getInstanceNumber());
		System.out.println(secondInstance.getInstanceNumber());
		System.out.println(thirdInstance.getInstanceNumber());
		System.out.println(Math.PI);

		int pw = 393939;
		Password password = new Password(pw);
		password.storePassword();
		password.allowAccess(48202);
		password.allowAccess(393939);



    }
}
