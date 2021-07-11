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


        int loc = 1;

        while (true) {
            System.out.println("first ln in whle. loc: " + loc + "  " + locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> paths = locations.get(loc).getPaths();
            System.out.println("Available paths: ");
            for (String path: paths.keySet()) {
                System.out.println(path + ", ");
            }
            System.out.println();

            String direction = s.nextLine().toUpperCase();
            System.out.println("DIRECTION: " + direction);

            if (paths.containsKey(direction)) {
                System.out.println("contained");
                loc = paths.get(direction);
            } else {
                System.out.println("You can't go in that direction");
            }

        }


    }
}
