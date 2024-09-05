// Given a positive integer N., The task is to find the value of Σi from 1 to N F(i) where function F(i) for the number i is defined as the sum of all divisors of i.
//
//Example 1:
//
//Input:
//N = 4
//Output:
//15
//Explanation:
//F(1) = 1
//F(2) = 1 + 2 = 3
//F(3) = 1 + 3 = 4
//F(4) = 1 + 2 + 4 = 7
//ans = F(1) + F(2) + F(3) + F(4)
//    = 1 + 3 + 4 + 7
//    = 15

public class SumOfAllDivisorsfrom1toN {
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(4));
    }
//    This give the time complexity in the worst case as the O(N^2)
    public static long sumOfDivisors(int N) {

        long sum = 0;
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <=i ; j++) {
                if(i%j == 0) {
                    sum += j;
                }
            }

        }
        return sum;
    }
//     Optimised version of the code.
    public static long optimised(int N) {
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += (N / i) * i;
        }
        return sum;
    }

}
