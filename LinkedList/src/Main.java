import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> itinerary = new LinkedList<>();
        itinerary.add("Tokyo");
        itinerary.add("Seoul");
        itinerary.add("Beijing");
        itinerary.add("Mumbai");
        itinerary.add("Hong Kong");
        itinerary.add("Taipei");
        itinerary.add("Manila");

        itinerary.add(3, "Singapore");
        itinerary.remove(1);
        printItinerary(itinerary);


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
}
