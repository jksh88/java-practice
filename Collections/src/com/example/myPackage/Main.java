package com.example.myPackage;

public class Main {

    public static void main(String[] args) {
	 Theater theater = new Theater("Running Scared", 11, 20);
	 theater.getSeats();
	 if(theater.reserveSeat("K9")) {
         System.out.println("Pay");
     } else {
         System.out.println("Seat taken already");
     }
    }
}
