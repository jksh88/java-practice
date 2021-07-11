import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationId;
    private final String description;
    private final Map<String, Integer> paths;

    public Location(int locationId, String destination) {
        this.locationId = locationId;
        this.description = destination;
        this.paths = new HashMap<>();
        this.paths.put("Q", 0);
    }

    public void addPath(String direction, int location) {
        paths.put(direction, location);
    }
    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getPaths() {
        return paths;
    }

//    public Location(int locationId, String description, Map<String, Integer> exits) {
//        this.locationId = locationId;
//        this.description = description;
//        this.exits = exits;
//    }
//
//    public int getLocationId() {
//        return locationId;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public Map<String, Integer> getExits() {
//        return exits;
//    }
}
