// 1480. Running Sum of 1d Array
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//Example 3:
//
//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]


import java.util.Arrays;

public class LeetCode1480 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    private static int[] runningSum(int[] arr) {
        int[] runningSum = new int[arr.length];
        runningSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            runningSum[i] = arr[i] + runningSum[i-1];
//            System.out.println(runningSum[i]);
        }
        return runningSum;
    }
}






















