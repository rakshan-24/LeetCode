class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0, rightsum=0,total=0;

        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            rightsum=total-leftsum-nums[i];

            if(rightsum==leftsum)   return i;
            
            leftsum+=nums[i];
        }
        return -1;
    }
}