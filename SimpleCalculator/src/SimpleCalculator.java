public class SimpleCalculator {
    static double firstNumber;
    static double secondNumber;
    public static double getFirstNumber() {
        return firstNumber;
    }
    public static double getSecondNumber() {
        return secondNumber;
    }
    public double setFirstNumber(double num) {
        firstNumber = num;
        return firstNumber;
    }
    public double setSecondNumber(double num) {
        secondNumber = num;
        return secondNumber;
    }
    public double getAdditonResult() {
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    public double getDivisionResult() {
        return secondNumber != 0 ? firstNumber / secondNumber : 0;
    }
}
