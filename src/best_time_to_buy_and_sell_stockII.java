public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i =0;i<prices.length-1;i++){
            int cur = prices[i];
            int next = prices[i+1];
            if(next > cur) profit += next-cur;
        }
        return profit;
    }
}