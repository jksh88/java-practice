public class Main {
    public static void main(String[] args) {
        Dog maltese = new Dog("Toby");
        maltese.breathe();
        Bird sparrow = new Sparrow("noNameBird");
        sparrow.eat();
        sparrow.fly();
        Penguin penguin = new Penguin("Penguin");
        penguin.fly();
    }
}
