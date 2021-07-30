public class Infinity extends Car {
    private int maxSpeed;
    private String color;
    private boolean loud;
    private String manufacturer;

    public Infinity(int price, boolean isGoodCar, String area, boolean iCanBuy, int maxSpeed, String color, boolean loud, String manufacturer) {
        super(price, isGoodCar, area, iCanBuy);
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.loud = loud;
        this.manufacturer = manufacturer;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setLoud(boolean loud) {
        this.loud = loud;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isLoud() {
        return loud;
    }

    public String getColor() {
        return this.color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
