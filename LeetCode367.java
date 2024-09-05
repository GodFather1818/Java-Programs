// 367. Valid Perfect Square.
//Given a positive integer num, return true if num is a perfect square or false otherwise.
//
//A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
//
//You must not use any built-in library function, such as sqrt.
//

public class LeetCode367 {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {
            long mid = start + (end - start) /2;
//            System.out.println(mid);
            long val = mid*mid;
//            System.out.println(mid*mid);
            if (val == num) {
                return true;
            }else if (val < num){
                start = (int)(mid + 1);
            }else {
                end = (int)(mid - 1);
            }
        }
        return false;
    }
}
