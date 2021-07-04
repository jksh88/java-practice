package com.example.myPackage;

public class Main {

    public static void main(String[] args) {
	 Theater theater = new Theater("Running Scared", 8, 12);
	 theater.getSeats();
	 if(theater.reserveSeat("A07")) {
         System.out.println("Pay");
     } else {
         System.out.println("Seat taken already");
     }
	 //not related. just checking A ascii value
//     char character = 'A';
//	 int ascii = (int) character;
//	 int nextAscii = character + 1;
//	 System.out.println(nextAscii);

    }
}
