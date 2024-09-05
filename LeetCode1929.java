import java.util.Arrays;
public class LeetCode1929 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
//        System.out.println(3%6);
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*(nums.length)];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[(i % ans.length) % nums.length];
        }
        return ans;
    }
}
