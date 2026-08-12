class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] used =new boolean[baskets.length];
        int unplaced=0;
        for(int i=0;i<fruits.length;i++){
            boolean placed=false;
            
            for(int j=0;j<baskets.length;j++){
                if(!used[j] && fruits[i]<=baskets[j]){
                    placed=true;
                    used[j]=true;
                    break;
                }
            }

            if(!placed)
                unplaced++; 
        }
        return unplaced;
    }
}