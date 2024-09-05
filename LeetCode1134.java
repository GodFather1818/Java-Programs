// Armstrong Number
public class LeetCode1134 {
    public static void main(String[] args) {
        System.out.println(armStrongNumber(123));
    }
    public static boolean armStrongNumber(int x) {
        int og = x;
        int sum = 0;
        while(x > 0) {
            int remainder = x % 10;
            sum += remainder * remainder * remainder;
            x = x / 10;
        }
        if (sum == og) {
            return true;
        }
        return false;
    }
}
