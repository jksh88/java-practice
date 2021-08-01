public class MyClass<T> {
    T obj;

    public MyClass(T obj) {
        this.obj = obj;
    }

    public void showType() {
        System.out.println(obj.getClass().getName());
    }
}
