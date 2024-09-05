// 69. Sqrt(x)
// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//You must not use any built-in exponent function or operator.
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//
//Example 1:
//
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
//Example 2:
//
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

public class LeetCode69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long val = (mid * mid);
            if (val <= n) {
                start = (int)(mid + 1);
            } else {
                end = (int)(mid - 1);
            }
        }
        return end;
    }
}
