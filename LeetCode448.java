// 448. Find All Numbers Disappeared in an Array
//Easy
//Topics
//Companies
//Hint
//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//
//
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//Example 2:
//
//Input: nums = [1,1]
//Output: [2]
//
//
//Constraints:
//
//n == nums.length
//1 <= n <= 105
//1 <= nums[i] <= n


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
//        disappearedNumber(arr);
//        disappearedNumber(arr);
        List<Integer> disappearedNumbers = findDisappearedNos(arr);
        System.out.println(disappearedNumbers);
    }

    public static List<Integer> findDisappearedNos(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
//        Find Missing Numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1){
                ans.add(index + 1);
            }
        }
        return ans;
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }

}
