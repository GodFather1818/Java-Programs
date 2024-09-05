public class ReverseANumber {
    public static void main(String[] args) {
        int ans = reverse(1234);
        System.out.println(ans);
    }
    // Without Recursion
//    static int reverse(int n){
//        int sum = 0;
//        while(n != 0){
//            int rem = n % 10;
//            n = n / 10;
//            sum = sum * 10 + rem;
//        }
//        return sum;
//    }
    static int reverse(int n){
        int sum = 0;
        if (n <= 0){
            return sum;
        }
        int rem = n % 10;
        sum = sum *10 + rem;
        return reverse(n/10);
    }
}
