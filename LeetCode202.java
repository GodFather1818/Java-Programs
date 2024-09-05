// 202. Happy Number
//Easy
//Topics
//Companies
//Write an algorithm to determine if a number n is happy.
//
//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.
//
//
//
//Example 1:
//
//Input: n = 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
//Example 2:
//
//Input: n = 2
//Output: false
//
//
//Constraints:
//
//1 <= n <= 231 - 1


// It is possible that when number is not a Happy Number, the code will keep on running and catch an infinte loop, or
// can catch the timelimit exceeding error, or can get out of bound error for an integer. So in short there is chances
// of the code to go into an infinte loop. Yes. So Since one can think of loop, CYCLE should come in the mind. Since,
// Use the fast and slow pointer method using the Linked Lists. Sqaure the Number add it to the Linked List.
// See the cycle is detected or not. If not any cycle detected then the number is a Happy Number. If any cycle is detected
// then the number is not a Happy Number.

public class LeetCode202 {


    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);

        if (slow == 1) {
            return true;
        }else {
            return false;
        }

    }
    private int findSquare (int number) {
        int ans = 0;
        while (number > 0) {
            int remainder = number % 10;
            ans += remainder * remainder;
            number = number / 10;
        }
        return ans;
    }


}
