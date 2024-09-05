// 81. Search in Rotated Sorted Array II
//Medium
//Topics
//Companies
//There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
//
//Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
//
//Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
//
//You must decrease the overall operation steps as much as possible.
//
//
//
//Example 1:
//
//Input: nums = [2,5,6,0,0,1,2], target = 0
//Output: true
//Example 2:
//
//Input: nums = [2,5,6,0,0,1,2], target = 3
//Output: false
//
//
//Constraints:
//
//1 <= nums.length <= 5000
//-104 <= nums[i] <= 104
//nums is guaranteed to be rotated at some pivot.
//-104 <= target <= 104


public class LeetCode81 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        System.out.println(search(arr, 0));
    }


    static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return true;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;

//          Applying all four cases over here

            if(mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            else if (mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
//            Now special cases curated for the duplicates present in the rotated Array


            // if elements at the middle, start, and at the end are equal then, just skip the duplicaes that is
            // skip the start and the end elements
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                // But what if the start or the end element is the pivot element?
                // check if the start is pivot: start > start+1
                if(start+1 < nums.length-1 && nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                // checking if the end is pivot or not?
                if(end - 1 > 0 && nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;

            }else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }


        return 1;
    }

    static boolean binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
