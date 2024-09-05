// 7. Reverse Integer
//Medium
//Topics
//Companies
//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//
//
//Example 1:
//
//Input: x = 123
//Output: 321
//Example 2:
//
//Input: x = -123
//Output: -321
//Example 3:
//
//Input: x = 120
//Output: 21
//
//
//Constraints:
//
//-231 <= x <= 231 - 1

public class LeetCode7 {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
    public static int reverse(int x) {
        int revNum = 0;
        boolean isNegative = false;
        if(x < 0) {
            x = Math.abs(x);
            isNegative = true;
        }
        while(x > 0) {
            int remainder = x % 10;
            // Check for overflow before updating revNum
            if (revNum > (Integer.MAX_VALUE - remainder) / 10) {
                return 0;
            }
            revNum = (revNum * 10) + remainder;
            x = x / 10;
        }
        if(isNegative) {
            revNum = revNum * -1;
        }
        return revNum;
    }
}
