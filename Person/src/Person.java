public class Person {
    public static String firstName;
    public static String lastName;
    public int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setLastName(String name){
        this.lastName = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public boolean isTeen() {
        return (getAge() > 12 && getAge() <20);
    }
    public String getFullName() {
        return firstName + ' ' + lastName;
    }
}
