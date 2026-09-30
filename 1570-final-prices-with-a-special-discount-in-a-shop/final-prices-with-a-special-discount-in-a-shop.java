class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int n=prices.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){ //NSL
                int index=st.pop();
                ans[index]=prices[index]-prices[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int index=st.pop();
            ans[index]=prices[index];
        }
        return ans;
    }
}