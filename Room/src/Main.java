public class Main {
    public static void main(String[] args) {
        Sqft mySize = new Sqft(50, 35);
        Color myColor = new Color("beige");
        Room myRoom = new Room(mySize, myColor);
        String description = myRoom.describeRoom();
        System.out.println(description);
    }
}
