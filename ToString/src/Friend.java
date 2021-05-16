public class Friend {
    private String name;
    private int age;
    private String college;
    private String course;
    private String city;

    public Friend(String name, int age, String college, String course, String city){
        this.name = name;
        this.age = age;
        this.college = college;
        this.course = course;
        this.city = city;
    }

//    public String toString() {
//        return name + " is " + age + " , went to " + college + " , takes " + course + " , and lives in " + city;
//    }
    //toString() method returns a string representation of an object


    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                ", course='" + course + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Friend aaron = new Friend("Aaron", 23, "SNU", "Math", "Seoul");
        System.out.println(aaron);
        System.out.println(aaron.toString()); //This doesn't matter. toString() is not going to make a difference. Still prints memory address
        Friend bobby = new Friend("Bobby", 48, "Yonsei", "CS", "NY");
        System.out.println(bobby);
        String name = "Jimmy";
        Integer edad = Integer.valueOf(50);
        String escuela = "MIT";
        String curso = new String("Stats");
        String ciudad = new String("ATL");
        System.out.println(name);
    }
}
