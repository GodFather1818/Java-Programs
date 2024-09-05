// 41. First Missing Positive
//Hard

//Hint
//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//
//
//
//Example 1:
//
//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.
//Example 2:
//
//Input: nums = [3,4,-1,1]
//Output: 2
//Explanation: 1 is in the array but 2 is missing.
//Example 3:
//
//Input: nums = [7,8,9,11,12]
//Output: 1
//Explanation: The smallest positive integer 1 is missing.
//
//
//Constraints:
//
//1 <= nums.length <= 105
//-231 <= nums[i] <= 231 - 1


import java.util.Arrays;

public class LeetCode41 {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
//        firstMissingPositive(arr);
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] arr) {

        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[correct] != arr[i] ) {
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
//        Now we have sorted this array in the ascending order ignoring the negative ones

//        Finding First Positive Missing Number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                return index+1;
            }
        }
        return arr.length + 1;
    }
    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
