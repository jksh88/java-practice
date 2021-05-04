public class Color {
    private String color;
    public Color(String color) {
        this.color = color;
    }

    public String stateColor() {
        return "color is " + this.getColor();
    }
    private String getColor() {
        return color;
    }
}
