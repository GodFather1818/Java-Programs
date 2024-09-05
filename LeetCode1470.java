// 1470. Shuffle the Array
//Easy
//Topics
//Companies
//Hint
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
//
//
//Example 1:
//
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
//Example 2:
//
//Input: nums = [1,2,3,4,4,3,2,1], n = 4
//Output: [1,4,2,3,3,2,4,1]
//Example 3:
//
//Input: nums = [1,1,2,2], n = 2
//Output: [1,2,1,2]
//
//
//Constraints:
//
//1 <= n <= 500
//nums.length == 2n
//1 <= nums[i] <= 10^3


import java.util.Arrays;

public class LeetCode1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = nums.length/2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    public static int[] shuffle(int[] arr, int n) {
//        BruteForce Approach.
        int[] ans = new int[arr.length];
//        int j=0;
//        for (int i = 0; i < ans.length; i += 2) {
//            ans[i] = arr[j];
//            ans[i+1] = arr[j+n];
//            j ++;
//        }
//        return ans;

        for (int i = 0; i < n; i++) {
            arr[i + n] += arr[i] * 10000;
        }
        for (int i = 0; i < n; i++) {
            arr[2*i] = arr[i + n] / 10000;
            arr[2*i + 1] = arr[i+n] % 10000;
        }
        return arr;



//        return ans;

    }
}
