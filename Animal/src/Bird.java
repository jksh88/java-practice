public abstract  class Bird extends Animal {
    public Bird(String name){
        super(name);
    }
    public void eat() {
        System.out.println(getName() + " is eating worms");
    }
    public void breathe() {
        System.out.println("breathe deep");
    }
    public abstract void fly();
}
