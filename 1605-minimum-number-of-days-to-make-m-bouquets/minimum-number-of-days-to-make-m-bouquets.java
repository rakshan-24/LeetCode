class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)   return -1;
        int left=1,right=0; //left 1 bcz multi cant be zero start from one
        for(int num:bloomDay)
            right=Math.max(right,num);
        while(left<right){
            int mid=left+(right-left)/2;
            int bouqet=0, flowers=0;
            for(int days:bloomDay){
                if(days<=mid){
                    flowers++;
                    if(flowers==k){
                        bouqet++;
                        flowers=0;
                    }
                }else   flowers=0; //if more than the req flowers
            }

            if(bouqet>=m)   right=mid;
            else    left=mid+1;
        }
        return left;
    }
}