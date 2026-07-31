class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int j = prices[0];
        int max_profit = 0;
        for(int i =0;i<n;i++){
            int diff = prices[i] - j;
            if(diff>max_profit){
                max_profit = diff;
            }
            if(prices[i]<j){
                j = prices[i];
            }
            

        }
        return max_profit;
    }
}