// 287. Find the Duplicate Number
//Medium
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//You must solve the problem without modifying the array nums and uses only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [1,3,4,2,2]
//Output: 2
//Example 2:
//
//Input: nums = [3,1,3,4,2]
//Output: 3
//Example 3:
//
//Input: nums = [3,3,3,3,3]
//Output: 3
//
//
//Constraints:
//
//1 <= n <= 105
//nums.length == n + 1
//1 <= nums[i] <= n
//All the integers in nums appear only once except for precisely one integer which appears two or more times.

import java.util.Arrays;

public class LeetCode287 {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};
        System.out.println(duplicateNumber(arr));
        System.out.println(Arrays.toString(arr));
    }
    public static int duplicateNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct] ){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
//        Finding Duplicate Numbers
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index +1 ) {
                return arr[index];
            }
        }

        return arr.length;
    }
    private static void swap(int[] arr, int a, int b) {
        int temp  = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}


