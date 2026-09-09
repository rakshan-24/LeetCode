class Solution {
    public int findMin(int[] n) {
        int l=0,r=n.length-1;
        while(l<r){
            if(n[l]<n[r])   return n[l];
            int mid=l+(r-l)/2;
            if(n[mid]>n[r])     l=mid+1;
            else    r=mid;
        }
        return n[r];

    }
}