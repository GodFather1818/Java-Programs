// 485. Max Consecutive Ones
//Easy
//Topics
//Companies
//Hint
//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//
//
//Example 1:
//
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//Example 2:
//
//Input: nums = [1,0,1,1,0,1]
//Output: 2
//
//
//Constraints:
//
//1 <= nums.length <= 105
//nums[i] is either 0 or 1.

import java.util.ArrayList;

public class LeetCode485 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int num = findMaxConsecutiveOnes(arr);
        System.out.println(num);
    }
//    This Logic works for only the test cases but not the edge cases.
    public static int findMaxConsecutiveOnes(int[] nums) {
//        ArrayList<Integer> consecutive = new ArrayList<>();
//        for (int i = 0; i < nums.length-1; i++) {
//            int counter = 1;
//
//            if(nums[i] != 0 && nums[i + 1] != 0 ) {
//                int j = i+1;
//                while(j<nums.length) {
//                    if(nums[j]!=0) {
//                        counter++;
//                        j++;
//                    }else {
//                        break;
//                    }
//                }
//            }
//            consecutive.add(counter);
//        }
//        int maximum = consecutive.get(0);
//        for (int i = 1; i < consecutive.size(); i++) {
//            if(consecutive.get(i) > maximum) {
//                maximum = consecutive.get(i);
//            }
//        }
//
//
//        return maximum;

        int currentConsecutive = 0;
        int maxConsecutive = 0;

        for (int num: nums) {
            if(num == 1) {
                currentConsecutive++;
                if(maxConsecutive < currentConsecutive) {
                    maxConsecutive = currentConsecutive;
                }
            }else{
                currentConsecutive = 0;
            }

        }
        return maxConsecutive;





//        return 0;
    }



}
