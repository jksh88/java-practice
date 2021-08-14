public class Main {

    public static void main(String[] args) {
        MyClass<Integer> intObj = new MyClass<>(10);
        MyClass<Double> dblObj = new MyClass<>(20.0);
        MyClass testObj = new MyClass<>(40);
//        TestClass test = displayType();

        System.out.println(dblObj.toString());
        MyClass<String> strObj = new MyClass("JK");
        //MyClass<Double> dblObj = new MyClass(20); //Q: Why does this work?
        //Q: Why does it need to be object type?

        intObj.showType();
        dblObj.showType();
        strObj.showType();
    }
}
