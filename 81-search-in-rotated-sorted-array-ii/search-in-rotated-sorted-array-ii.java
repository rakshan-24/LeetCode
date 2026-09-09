class Solution {
    public boolean search(int[] n, int target) {
       int l=0,r=n.length-1;
       while(l<=r){
        int mid=l+(r-l)/2;
        if(n[mid]==target)  return true;
        if(n[l]==n[mid] && n[r]==n[mid]){
            l++;
            r--;
        }
        else if(n[l]<=n[mid]){
            if(n[l]<=target && target<n[mid]){
                r=mid-1;
            }
            else    l=mid+1;
        }
        else{
            if(n[mid]<target && target<=n[r]){
                l=mid+1;
            }
            else    r=mid-1;
        }
       }
       return false; 
    }
}