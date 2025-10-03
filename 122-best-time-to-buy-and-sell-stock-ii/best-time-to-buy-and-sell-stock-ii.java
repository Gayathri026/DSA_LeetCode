class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = prices[0];
        for(int i =1;i<prices.length;i++){
            if(prices[i]<=min){
                min = prices[i];
            }
            else{
            result += prices[i]-min;
            min = prices[i];
            }
        }
        
        return result;
    }
}