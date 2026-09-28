class Solution {
    public int[] asteroidCollision(int[] ass) {
        Stack<Integer> st=new Stack<>();
        for(int a:ass){
            while(!st.isEmpty() && st.peek()>0 && a<0){ //+ve ,-ve
                if(st.peek()<-a){
                    st.pop();
                    continue;
                }
                if(st.peek()==-a){
                    st.pop();
                }
                a=0;
                break;
            }
            if(a!=0)    st.push(a);
        }
        int[] ans=new int[st.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=st.get(i);
        }
        return ans;
    }
}