public class Main {
    public static void main(String[] args) {
        Age age = new Age();
        age.setDay(3);
        age.setMonth(11);
        age.setYear(1973);
        ImmutableStudent student = new ImmutableStudent(2, "Alex", age);
        System.out.println("Alex age before modification: " + student.getAge().getYear());
        student.getAge().setYear(1994);
        System.out.println("Alex age after modification: " + student.getAge().getYear());
    }
}
