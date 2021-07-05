import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = getIntLBYL();
        System.out.println("x: " + x);
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Enter an integer: ");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }
}
