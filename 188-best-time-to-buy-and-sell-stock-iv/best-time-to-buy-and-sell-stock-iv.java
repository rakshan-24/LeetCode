class Solution {
    public int maxProfit(int k, int[] prices) {
        int[] buy=new int[k+1];
        int[] sell=new int[k+1];
        Arrays.fill(buy,Integer.MIN_VALUE);
        for(int j=0;j< prices.length;j++){
            for(int i=1;i<=k;i++){
                buy[i]=Math.max(buy[i],sell[i-1]-prices[j]);
                sell[i]=Math.max(sell[i],buy[i]+prices[j]);
            }
        }
        return sell[k];
        
    }
}