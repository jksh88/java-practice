public abstract  class Bird extends Animal implements CanFly {
    public Bird(String name){
        super(name);
    }
    public void eat() {
        System.out.println(getName() + " is eating worms");
    }
    public void breathe() {
        System.out.println("breathe deep");
    }
    public void fly(){
        System.out.println(getName() + " is flapping the wings");
    }
}
