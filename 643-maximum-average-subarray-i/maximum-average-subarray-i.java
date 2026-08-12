class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum=0, sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=sum;

        for (int i=k;i<nums.length;i++){
            sum+=nums[i]; //adding
            sum-=nums[i-k]; //deleting

            maxSum=Math.max(maxSum,sum);
        }
        return (double)maxSum/k;
        
    }
}