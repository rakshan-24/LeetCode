class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map=new HashMap<>();
        int left=0,right=0,maxLen=0;
        for(;right<fruits.length;right++){
            int currCount=map.getOrDefault(fruits[right],0);
            map.put(fruits[right],currCount+1);
            
            while(map.size()>2){
                int fruitCount=map.get(fruits[left]);
                if(fruitCount==1){
                    map.remove(fruits[left]);
                }else{
                    map.put(fruits[left],fruitCount-1);
                }
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
        
    }
}