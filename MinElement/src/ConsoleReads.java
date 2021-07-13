import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleReads {
    //    int[] numArr = {};
    public ArrayList<Integer> numbers = new ArrayList<>();

    public ArrayList<Integer> readIntegers(int count) {
        int currentCount = 0;
        while (currentCount <= count) {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            numbers.add(num);
            currentCount++;
        }
        return numbers;
    }

    public int findMin(ArrayList<Integer> lst) {
        int min = lst.get(0);
        for (Integer i: lst) {
            if (lst.get(i) < min) {
                min = lst.get(i);
            } else {
                continue;
            }
        }
        return min;
    }
}
