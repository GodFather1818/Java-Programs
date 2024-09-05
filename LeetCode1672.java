// 1672. Richest Customer Wealth


public class LeetCode1672 {

    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{3,2,1}};
        int ans = maximumWealth(nums);
        System.out.println(ans);
    }


    public static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;

            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }

}
