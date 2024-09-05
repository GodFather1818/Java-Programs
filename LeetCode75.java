// 75. Sort Colors
//Medium
//Topics
//Companies
//Hint
//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//
//You must solve this problem without using the library's sort function.
//
//
//
//Example 1:
//
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//Example 2:
//
//Input: nums = [2,0,1]
//Output: [0,1,2]
//
//
//Constraints:
//
//n == nums.length
//1 <= n <= 300
//nums[i] is either 0, 1, or 2.
//
//
//Follow up: Could you come up with a one-pass algorithm using only constant extra space?

import java.util.Arrays;

public class LeetCode75 {

    public static void main(String[] args) {
        int[] arr = {2, 0, 0, 1, 0, 0, 2, 2, 0, 1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(index);
    }
    public static void sortColors(int[] arr) {
//        ---------------------------------- My Brute Force Solution, Passed 82 test cases failed for the last 5 test cases.-------------
////        For Colour 0;
//
//        int currentColor = 0;
//        int i = 0;
//
//        int j= i + 1;
//        while(i < arr.length && j<arr.length){
//            if(arr[j] == currentColor) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j = i + 1;
//            }else {
//                j++;
//            }
//        }
//        For color 1
//        First find colour 1
//        for (int k = 0; k < arr.length; k++) {
//            if(arr[k] == 1){
//                int temp = arr[k];
//                arr[k] = arr[i];
//                arr[i] = temp;
//            }
//        }


//        currentColor = 1;
//
//        int newi = i;
//
//        j= newi + 1;
//        while(newi < arr.length && j<arr.length){
//            if(arr[j] == currentColor) {
//                int temp = arr[newi];
//                arr[newi] = arr[j];
//                arr[j] = temp;
//                newi++;
//                j = newi + 1;
//            }else {
//                j++;
//            }
//        }
////        For color 2
//        i = 0;
//
//        j= i + 1;
//        while(i < arr.length && j<arr.length){
//            if(arr[j] == currentColor) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j = i + 1;
//            }else {
//                j++;
//            }
//        }
//        return i;
//
//

//        -----------------------                  Strivers Better Solution              ------------------------------------------

//        int count0 = 0, count1 = 0, count2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                count0++;
//            }else if (arr[i] == 1){
//                count1++;
//            }else {
//                count2++;
//            }
//        }
//        System.out.println(count0);
//        System.out.println(count1);
//        System.out.println(count2);
//
//        for (int i = 0; i < count0; i++) {
//            arr[i] = 0;
//        }
//        for (int i = count0; i < count0 + count1; i++) {
//            arr[i] = 1;
//        }
//        for (int i = count0 + count1; i < arr.length; i++) {
//            arr[i] = 2;
//        }
// ----------------------------------           Strivers Optimal Solution (Dutch National Flag Algotrithm (Low, Mid, High) --------------------

//         The algorithm revolves around 3 pointer namely: Low, mid and High
//        The algo says:
//        from the index (0 - low-1) :- This subarray will contain, only 0's.
//        From the index (low - mid-1) :- This subarray will contain only 1's.
//        From the index (mid - high) :- This subarray will contain any random numbers (i.e 0/1/2).
//        From the index (high+1 - arr.length-1) :- This subarray will contain all 2's.

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr,low, mid);
                mid ++;
                low ++;
            }else if(arr[mid] == 1) {
                mid ++;
            }else {
                swap(arr, mid, high);
                high --;
            }
        }
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }





}
