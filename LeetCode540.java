public class LeetCode540 {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
//Checking for edge cases before handed to avoid checking those in the loops.

        if(nums.length == 1) {
            return nums[0];
        }
        if(nums[0] != nums[1]) {
            return nums[0];
        }
        if(nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length-1];
        }
//        Since the first and the last condition is checked, our searched space reduced to [1, n-1]

        int start = 1;
        int end = nums.length-2;
        while(start <= end) {
            int mid = start + (end - start)/2;

//            Checking for the case for eliminating the left hand side
            if((mid%2==1 && nums[mid] == nums[mid-1] ) || (mid%2==0) && nums[mid] == nums[mid+1]) {
                start = mid + 1;
            }else if((mid%2==1 && nums[mid]==nums[mid+1]) || (mid%2==0)&& nums[mid] == nums[mid-1]) {
                end = mid - 1;
            }else{
                return nums[mid];
            }


        }
        return -1;
    }
}
