// 1295. Find Numbers with Even Number of Digits. i.e those numbers whose count of digits should be even.

public class Leetcode1295 {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    public static int digits(int num){
        if(num<0){
            num *= -1;
        }
        return (int)(Math.log10(num)) + 1;
    }


}
