class Car {
    private String name;
    private int cylinders;


    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Ford extends Car {
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }
}

public class Main {

    public static void main(String[] args) {
        Car daewoo = new Car("Leganza", 6);
        Ford ford = new Ford("Expedition", 4);

        printSpecs(daewoo);
        printSpecs(ford);
        System.out.println(ford instanceof Car);
        System.out.println(daewoo instanceof Ford);
    }

    public static void printSpecs(Car car) {
        System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
    }
}
