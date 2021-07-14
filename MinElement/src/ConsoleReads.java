import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleReads {
    public ArrayList<Integer> numbers = new ArrayList<>();

    public ArrayList<Integer> readIntegers(int count) {
        int currentCount = 0;
        while (currentCount < count) {
            System.out.println("Enter a number: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            currentCount++;
            System.out.println(currentCount);
            numbers.add(num);
        }
        return numbers;
    }

    public int findMin(ArrayList<Integer> lst) {
        System.out.println("lst size: " + lst.size());
        int min = lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) < min) {
                min = lst.get(i);
            } else {
                continue;
            }
        }
        return min;
    }
}
