import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class RotateArray {
    public static void rightRotate(int[] nums, int k) {

        k = k % nums.length;

        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length - 1);


    }

    public static void leftRotate(int[] nums, int k) {

        k = k % nums.length;
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length - 1);
        reverseArray(nums, 0, nums.length - 1);



    }


    static void reverseArray(int[] nums, int start, int end) {

        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }


    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
//        rightRotate(nums, 3);
        leftRotate(nums, 3);
        System.out.println(Arrays.toString(nums));

    }
}
