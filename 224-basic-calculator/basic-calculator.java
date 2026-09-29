class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int num=0,sign=1,ans=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='+'){
                ans+=sign*num;
                num=0;
                sign=1;
            }else if(c=='-'){
                ans+=sign*num;
                num=0;
                sign=-1;
            }else if(c=='('){
                st.push(ans);
                st.push(sign);
                ans=0;
                num=0;
                sign=1;
            }else if(c==')'){
                ans+=sign*num;
                int oldsign=st.pop();
                int oldans=st.pop();
                ans=oldans+ oldsign * ans;
                num=0;
            }     
        }
        ans+=sign*num;
        return ans;
    }
}