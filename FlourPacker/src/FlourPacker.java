public class FlourPacker {
    private static boolean canPack(int big, int small, int goal) {
        if (big < 0 || small < 0 || goal < 0) {
            return false;
        } else if (big * 5 + small < goal) {
            return false;
        }
        return (goal % 5 <= small);
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(1, 5, 9));
        System.out.println(canPack(1, 5, 4));
        System.out.println(canPack(2, 5, 11));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(4, 18, 19));
        System.out.println(canPack(5, 3, 24));
        System.out.println(canPack(2, 2, 12));
    }
}
