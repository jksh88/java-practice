public class Car extends Vehicle {
    int price;
    boolean isGoodCar;

    public Car(int price, boolean isGoodCar, String area, boolean iCanBuy) {
        super(area, iCanBuy);
        this.price = price;
        this.isGoodCar = isGoodCar;
    }

    public int getPrice() {
        return price;
    }

    public void isGoodCar() {
        System.out.println("Good car yes");
        ;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
