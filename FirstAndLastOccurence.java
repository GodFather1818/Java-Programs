import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
    }


    public static int search(int[] arr, int target, boolean isFirstIndex) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target < arr[mid]) {
                end = mid - 1;
            }else if(target > arr[mid]) {
                start = mid + 1;
            }else {
//                Potential Answer find
                ans = mid;
                if(isFirstIndex) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
