public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1342;
        System.out.println("The sum is " + sumOfDigits(number));
    }
    static int sumOfDigits(int n){
        int sum = 0;
        while(n != 0){
            int remainder = n % 10;
            sum += remainder;
            n = n / 10;
        }
        return sum;
    }

}
