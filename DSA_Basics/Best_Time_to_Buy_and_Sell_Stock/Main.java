//Brute Force
class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i;j<prices.length;j++){
                int diff=prices[j]-prices[i];
                
                if(diff>max)max=diff;
            }
        }
        return max;
    }
}
//Optimized
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);

            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}