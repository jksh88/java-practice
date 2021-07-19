import java.lang.Math;
public class Point {
    private int x;
    private int y;
    public Point() {

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceWithoutParams() {

        int sumOfSqrs = x*x + y*y;
        double result = Math.sqrt(sumOfSqrs);
        return result;
    }

    public double distanceWithTwoParams(int a, int b) {

        double result = Math.sqrt((a-x)*(a-x) + (b-y)*(b-y));
        return result;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        Point point = new Point(x, y);
        System.out.println(point.distanceWithoutParams());
        point.setX(x);
        point.setY(y);
        double distanceBtwnTwo = point.distanceWithTwoParams(6, 10);
        System.out.println(distanceBtwnTwo);
    }
}
