class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int maxCount=0, balance=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)  balance--;
            else balance++;

            if(map.containsKey(balance)){
                int length=i-map.get(balance);
                maxCount=Math.max(maxCount, length);
            }else
                map.put(balance,i);
        
        }
        return maxCount;
    }
}