public class Sqft {
    private int width;
    private int length;

    public Sqft(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getSqft() {
        return width * length;
    }
}
