class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,maxOne=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxOne=Math.max(maxOne,count);
            }else{
                count=0;
            }
        }
        return maxOne;
        
    }
}