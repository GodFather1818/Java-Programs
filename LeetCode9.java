// 9. Palindrome Number
//Easy
//Topics
//Companies
//Hint
//Given an integer x, return true if x is a
//palindrome
//, and false otherwise.
//
//
//
//Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//
//Constraints:
//
//-231 <= x <= 231 - 1
public class LeetCode9 {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int x) {
        int og = x;
        int revNum = 0;
        boolean isNegative = false;
        if(x < 0) {
            x = Math.abs(x);
            isNegative = true;
        }
        while(x > 0) {
            int remainder = x % 10;
            if (revNum > (Integer.MAX_VALUE - remainder) / 10) {
                return false;
            }
            revNum = (revNum * 10) + remainder;
            x = x / 10;
        }

        if(isNegative) {
            revNum = revNum * -1;
            return false;
        }
        if(revNum == og) {
            return true;
        }
        return false;
    }
}
