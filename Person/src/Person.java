public class Person {
    private String firstName;
    private String lastName;
    private int age = 0;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return (getAge() > 12 && getAge() < 20);
    }

    public String getFullName() {
        if (firstName == "" || lastName == "") {
            return firstName + lastName;
        }
        return firstName + ' ' + lastName;
    }
}
