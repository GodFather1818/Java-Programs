// 441. Arranging Coins
//You have n coins and you want to build a staircase with these coins. The staircase consists of k rows
// where the ith row has exactly i coins. The last row of the staircase may be incomplete.
//
// Given the integer n, return the number of complete rows of the staircase you will build.
// Input: n = 5
//Output: 2
//Explanation: Because the 3rd row is incomplete, we return 2.


public class LeetCode441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(22));
    }
//    -----1st Solution O( N ) Time Complexity. ----------
//    public static int arrangeCoins(int n) {
//        int i = 0;
//        while (n > 0){
////            System.out.println(n);
//            n = n-i-1;
////            System.out.println(i);
//            i++;
////            System.out.println(i);
//        }
//        return --i;
//    }
//    2nd Solution ------- O( Log N ) Time Complexity --------------
//    Memory -- Beats 84.96%of users with Java
//    Runtime -- Beats 100.00%of users with Java
    public static int arrangeCoins(int n) {
        int start = 0;
        int end = n;
        while( start <= end ){
            long mid = start + (end - start)/2;
            long val = mid*(mid+1)/2;
            if (val > n ){
                end = (int) (mid - 1);
            }else if(val <= n) {
                start = (int) (mid + 1);
            }
        }
        return end;
    }
}
