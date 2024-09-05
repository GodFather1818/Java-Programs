public class LongestSubarrayWithSumK {
//    Containing Positive arrays
    public static int lenOfLongSubarr (int arr[], int N, int K) {
        //Complete the function
        int maxLen = 0;
        int right = 0, left = 0; // 2 - pointers
        int sum = arr[0];

        while(right < arr.length) {

//            if sum > k, reduce the subarray from left
//            until sum becomes less or equal to k:
            while(sum > K && left <= right) {
                sum -= arr[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if(sum == K) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward the right pointer
            right ++;
            if(right < arr.length) sum += arr[right];
        }


        return maxLen;
    }

    public static void main(String[] args) {
        int[] A = {10, 5, 2, 7, 1, 9};
        System.out.println(lenOfLongSubarr(A, 6, 15));
    }
}
