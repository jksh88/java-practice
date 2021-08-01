public class TestClass {
//    public class TestClass {
        double myOb;

        public TestClass (double myOb) {
            this.myOb = myOb;
        }

        public void displayType() {
            System.out.println(myOb);
        }
//    }

    public static void main(String[] args) {
//        MyClass<Integer> intObj = new MyClass(10);
        MyClass<Double> dblObj = new MyClass(20);
        TestClass testObj = new TestClass(40);
//        TestClass.displayType();

//        System.out.println();
//        System.out.println(dblObj.toString());
//        MyClass<String> strObj = new MyClass("JK");
        //MyClass<Double> dblObj = new MyClass(20); //Q: Why does this work?
        //Q: Why does it need to be object type?

//        intObj.showType();
//        dblObj.showType();
//        strObj.showType();
    }
}
