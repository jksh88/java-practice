import java.awt.*;

public class Room {
    private Sqft size;
    private Color color;
    public Room(Sqft size, Color color) {
        this.size = size;
        this.color = color;
    }

    public String describeRoom() {
        return "My room is " + size.getSqft() + " sf in size and " + color.stateColor();
    }

}
