class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int minCap=0, maxCap=0;
        for(int weight:weights){
            minCap=Math.max(minCap,weight);
            maxCap+=weight;
        }
        while(minCap<maxCap){
            int mid=minCap+(maxCap-minCap)/2;
            int sum=0,days=1;
            for(int weight:weights){
                if(sum+weight>mid){
                    days++;//next day
                    sum=0;//reset
                }
                sum+=weight;
            }

            if(days<=D){
                maxCap=mid;
            }
            else   minCap=mid+1;

        }
        return minCap;
    }
}