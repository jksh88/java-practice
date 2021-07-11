import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        locations.put(0, new Location(0, "home"));
        locations.put(1, new Location(1, "la"));
        locations.put(2, new Location(2, "atl"));
        locations.put(3, new Location(3, "chicago"));
        locations.put(4, new Location(4, "dallas"));
        locations.put(5, new Location(5, "ny"));
        locations.put(6, new Location(6, "seattle"));

        locations.get(1).addPath("E", 3);

        locations.get(2).addPath("N", 5);

        locations.get(3).addPath("E", 5);
        locations.get(3).addPath("W", 1);
        locations.get(3).addPath("S", 4);

        locations.get(4).addPath("N", 3);

        locations.get(5).addPath("S", 2);
        locations.get(5).addPath("W", 3);

        locations.get(6).addPath("S", 1);

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");

        int loc = 1;

        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> paths = locations.get(loc).getPaths();
            System.out.println("Available paths: ");
            for (String path: paths.keySet()) {
                System.out.println(path + ", ");
            }
            System.out.println();

            String input = s.nextLine().toUpperCase();
            String[] splitInput = input.split(" ");
            System.out.println(splitInput);
            String direction = input;
            for(String i: splitInput) {
                if (vocabulary.containsKey(i)) {
                    direction = vocabulary.get(i);
                    break;
                }
//                if (i.equalsIgnoreCase("East")) {
//                    direction = "E";
//                    System.out.println("i: " + i);
//                }
            }
            System.out.println("Input: " + input);
            System.out.println("direction: " + direction);

            if (paths.containsKey(direction)) {
                loc = paths.get(direction);
            } else {
                System.out.println("You can't go in that direction");
            }

        }


    }
}

//In general, both equals() and “==” operator in Java are used to compare objects to check equality but here are some of the differences between the two:
//
//
//The main difference between the .equals() method and == operator is that one is a method and the other is the operator.
//We can use == operators for reference comparison (address comparison) and .equals() method for content comparison. In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
