import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> itinerary = new LinkedList<>();
        addInOrder(itinerary, "Tokyo");
        addInOrder(itinerary, "Seoul");
        addInOrder(itinerary, "Beijing");
        addInOrder(itinerary, "Mumbai");
        addInOrder(itinerary, "Hong Kong");
        addInOrder(itinerary, "Taipei");
        addInOrder(itinerary, "Manila");

        itinerary.add(3, "Singapore");
        itinerary.remove(1);
        printItinerary(itinerary);
        visit(itinerary);


    }


    private static void printItinerary(LinkedList<String> list) {
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {

            System.out.println("Next city is " + i.next());
        }
        System.out.println("======================");
    }

    private static boolean addInOrder(LinkedList<String> list, String newCity) {
        ListIterator<String> stringListIterator = list.listIterator();
        //Q: Probably list itself doesn't get reinitiated each time addInOrder gets called. It's the same list from before the invocation. Just that the stringListIterator object gets reinitiated?
// This line above creates the iterator but it doesn't yet point to the first record in teh linkedList yet. I need to call the .next() to point for that.
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " already on itinerary");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }

        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {

                case 0:
                    System.out.println("Trip over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached end of list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("Start of list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    public static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - go to menu options\n"
        );

    }
}
