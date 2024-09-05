// 1539. Kth Missing Positive Number.
// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
//
//Return the kth positive integer that is missing from this array.
//
//
//
//Example 1:
//
//Input: arr = [2,3,4,7,11], k = 5
//Output: 9
//Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

// ----------- Beats 100% Users in Runtime and, beats 21.38% Users in terms of Memory. ----------------------------

public class LeetCode1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            int missing = arr[mid] -(mid + 1);
            if (missing < k) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start + k;
    }
}
