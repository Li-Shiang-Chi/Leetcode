public class Solution {
    ArrayList<Integer> dp = new ArrayList<Integer>();
    public int climbStairs(int n) {
        dp.add(0); // dp[0] = 0
        dp.add(1); // dp[1] = 1
        dp.add(2); // dp[2] = 2
        for(int i = 3 ; i <= n ; i++){
            int input = dp.get(i-1) + dp.get(i-2);
            dp.add(input);
        }
        return dp.get(n);
    }
}