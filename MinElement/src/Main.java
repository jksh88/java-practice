import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConsoleReads reads = new ConsoleReads();
        ArrayList<Integer> lst = reads.readIntegers(3);
        int min = reads.findMin(lst);
        System.out.println(min);
    }

}
