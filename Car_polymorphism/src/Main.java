

class Car {
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    public Car(boolean engine, int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String name() {
        return name;
    }

    public boolean startEngine(boolean engine) {
        return engine;
    }

    public void accelerate() {
        System.out.println("going fast but speed varies depending on what car");
    }

    public void brake() {
        System.out.println("braking at parent");
    }
}

class Infinity extends Car {
    public Infinity() {
        super(true, 6, "G60");
    }

    public void accelerate() {
        System.out.println("Great Infinity speed");
    }

}

class Sonata extends Car {
    public Sonata() {
        super(false, 4, "Sonata");
    }
    public void brake() {
        System.out.println("brake Sonata!");
    }
}

class Kia extends Car {
    public Kia() {
        super(false, 8, "K9");
    }

    public void brake() {
        System.out.println("Brake hard for K9 since it is heavy");
    }

    public void accelerate() {
        System.out.println("Does K9 accelerate well?");
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5 ; i++){
            Car myCar = giveRandomCar();
            myCar.brake();
            myCar.accelerate();
        }
    }

    public static Car giveRandomCar() {
        int randNumber = (int) (Math.random() * 3) + 1;
        switch (randNumber) {
            case 1:
                return new Infinity();
            case 2:
                return new Sonata();
            case 3:
                return new Kia();

        }
        return null;

    }
}
