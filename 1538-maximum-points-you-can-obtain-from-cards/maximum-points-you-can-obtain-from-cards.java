class Solution {
    public int maxScore(int[] nums, int k) {
        int left=0, right=0, sum=0, maxSum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=sum;

        for(int i=0;i<k;i++){
            sum-=nums[k-1-i];
            sum+=nums[nums.length-1-i];

            maxSum=Math.max(maxSum,sum); 
        }
        return maxSum;

    }
}