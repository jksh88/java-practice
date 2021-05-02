public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(134518531));
        System.out.println(isPalindrome(-3333));
    }
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        String numberString = Integer.toString(number);
        int length = numberString.length();
        for(int i = 0; i < length / 2; i++) {
//            System.out.println(numberString.charAt(i));
//            System.out.println(numberString.charAt(length - i -1));
            if(numberString.charAt(i) != numberString.charAt(length - i -1)){
            return false;}
        }
        return true;
    }
}
