import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        int[] hisArr = myArr;
        //Both references(myArr, hisArr) pointing to the same address in memory that holds the array of five elements of zero
        System.out.println("myArr: " + myArr);  //[I@7e0ea639
        System.out.println("hisArr: " + hisArr);  //[I@7e0ea639

        hisArr[2] = 11;
        System.out.println("myArr: " + Arrays.toString(myArr));
        System.out.println("hisArr: " + Arrays.toString(hisArr));

        myArr[2] = 22;
        System.out.println("myArr: " + Arrays.toString(myArr));
        System.out.println("hisArr: " + Arrays.toString(hisArr));

        //If I reinitialize myArr to reference to a different address containing a new array(newly created), hisArr still references the original address
        myArr = new int[] {1,2,3,4,5};
        System.out.println("myArr: " + myArr);  //[I@3d24753a
        System.out.println("hisArr: " + hisArr);  //[I@7e0ea639
        System.out.println("myArr: " + Arrays.toString(myArr));
        System.out.println("hisArr: " + Arrays.toString(hisArr));

        int myInt = 20;
        int hisInt = myInt;
        hisInt++;
        System.out.println("myInt: " + myInt);
        System.out.println("hisInt: " + hisInt);


    }

}
