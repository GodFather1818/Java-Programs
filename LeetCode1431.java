// 1431. Kids With the Greatest Number of Candies
// There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//
//Note that multiple kids can have the greatest number of candies.
//
//
//
//Example 1:
//
//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true]
//Explanation: If you give all extraCandies to:
//- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//Example 2:
//
//Input: candies = [4,2,1,1,2], extraCandies = 1
//Output: [true,false,false,false,false]
//Explanation: There is only 1 extra candy.
//Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
//Example 3:
//
//Input: candies = [12,1,12], extraCandies = 10
//Output: [true,false,true]

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class LeetCode1431 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(Arrays.toString(greatestCandy(arr, extraCandies)));
    }

    private static boolean[] greatestCandy(int[] arr, int extraCandies) {
        boolean[] result = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            sum = arr[i] + extraCandies;
            System.out.println(sum);
            for (int k : arr) {
                if (sum < k) {
//                    System.out.println(sum);
                    result[i] = false;
                    break;
                }
                result[i] = true;
            }
        }
        return result;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // Find the maximum number of candies that any kid currently has.
        int maxCandies = Integer.MIN_VALUE;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        // List to store the results, whether each kid can have the maximum number
        // of candies after receiving extraCandies.
        List<Boolean> result = new ArrayList<>();

        // Loop through each kid's candies to determine if they can reach maxCandies
        // with their current candies plus extraCandies.
        for (int candy : candies) {
            // If the current kid's candies plus extraCandies is greater than or
            // equal to maxCandies, add 'true' to the result list, otherwise add 'false'.
            result.add(candy + extraCandies >= maxCandies);
        }

        // Return the result list.
        return result;
    }

}
