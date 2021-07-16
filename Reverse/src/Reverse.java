import java.util.Arrays;

public class Reverse {

    public void reverse(int[] nums) {
        System.out.println("Original array: " + Arrays.toString(nums));
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[nums.length - i - 1];
            nums[nums.length -i -1 ] = nums[i];
            nums[i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(nums));
    }



}
