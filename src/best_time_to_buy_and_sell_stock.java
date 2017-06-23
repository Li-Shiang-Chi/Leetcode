public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices == null) return 0;
        
        /*int profit = 0;
        int minPrice = prices[0];
        for(int i =1;i<prices.length;i++){
            minPrice = Math.min(minPrice , prices[i]);
            profit = Math.max(profit , prices[i] - minPrice);
        }
        return profit;*/
        int cur = 0;
        int max = 0;
        
        for(int i =1 ; i<prices.length ; i++){
            cur = Math.max(0 , cur+prices[i]-prices[i-1]);
            max = Math.max(cur , max);
        }
        return max;
    }
}