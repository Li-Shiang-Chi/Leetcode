public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++)
            sum+= nums[i];
        if (sum % 2 !=0) return false;
        sum = sum / 2;
        
        boolean[][] dp = new boolean[nums.length][sum+1];
        
        if(nums[0] <= sum) dp[0][nums[0]] = true;
        
        for(int i=0 ; i<nums.length;i++){
            dp[i][0] = true;
        }
        
        for(int i=1;i<nums.length;i++){
            for(int j=1;j<=sum;j++){
                if(nums[i] > j) dp[i][j] = dp[i-1][j];
                else dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
            }
        }
        return dp[nums.length-1][sum];
        
    }
}