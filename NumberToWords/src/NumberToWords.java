public class NumberToWords {
    private static void numberToWords(int number) {
        int revNum = reverse(number);
        if (number < 0 || revNum < 0) {
            System.out.println("Invalid Value");
            return;
        }
        String result = "";
        for (int j = 0; j < getDigitCount(number); j++) {
            if (revNum % 10 == 0) {
                result += "Zero ";
            } else if (revNum % 10 == 1) {
                result += "One ";
            } else if (revNum % 10 == 2) {
                result += "Two ";
            } else if (revNum % 10 == 3) {
                result += "Three ";
            } else if (revNum % 10 == 4) {
                result += "Four ";
            } else if (revNum % 10 == 5) {
                result += "Five" ;
            } else if (revNum % 10 == 6) {
                result += "Six ";
            } else if (revNum % 10 == 7) {
                result += "Seven ";
            } else if (revNum % 10 == 8) {
                result += "Eight ";
            } else if (revNum % 10 == 9) {
                result += "Nine ";
            }
            if (number < 10) {
                break;
            } else {
                revNum = (int ) Math.floor(revNum / 10);
            }
        }
        System.out.println(result);
    }
    private static int reverse(int number) {

        String numStr = Integer.toString(Math.abs(number));
        String revStr = "";
        for (int i = numStr.length() - 1; i >= 0; i--) {
            revStr += numStr.charAt(i);
        }
        int revNum = Integer.parseInt(revStr);
        return number < 0 ? -1 * revNum : revNum;
    }

    private static int getDigitCount(int number) {
        return number < 0 ? -1: Integer.toString(number).length();
    }

    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//        System.out.println(reverse(-121));
//        System.out.println(reverse(2121));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
        numberToWords(123);
        numberToWords(1011);
        numberToWords(1000);
        numberToWords(-12);
    }
}
