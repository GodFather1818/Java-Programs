//
//Code
//Testcase
//Test Result
//Test Result
//283. Move Zeroes
//Easy
//Topics
//Companies
//Hint
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//
//
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]
//
//
//Constraints:
//
//1 <= nums.length <= 104
//-231 <= nums[i] <= 231 - 1
//


import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode283 {
    
//    BruteForce Approach
    public static void moveZeros(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                temp.add(nums[i]);
            }
        }

        int length = temp.size();

        for (int i = 0; i < length; i++) {
            nums[i] = temp.get(i);
        }

        for (int i = length; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    
//    Optimized Approach
    public static void moveZeroes2(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j+1; i < nums.length ; i++) {
            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes2(arr);

        System.out.println(Arrays.toString(arr));

    }

}
