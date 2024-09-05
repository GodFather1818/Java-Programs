// 34. Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position
// of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.

import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
    public static int[] searchRange(int[] arr, int target){
        int[] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        if (ans[0] != -1){
            ans[1] = search(arr, target, false);
        }
        return ans;
    }
    public static int search(int[] arr, int target, boolean findFirstindex){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
               end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findFirstindex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
