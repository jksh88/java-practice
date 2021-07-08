package com.example.myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Running Scared", 8, 12);
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        seatCopy.get(3).reserve();
        if (theater.reserveSeat("B01")) {
            System.out.println("Pay");
        } else {
            System.out.println("Seat taken");
        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theater.seat");
        printList(theater.seats);

        Theater.Seat minSeat = Collections.min(seatCopy);
        Theater.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
    }


    public static void printList(List<Theater.Seat> list) {
        for(Theater.Seat seat: list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=============================================================================");
    }


}
