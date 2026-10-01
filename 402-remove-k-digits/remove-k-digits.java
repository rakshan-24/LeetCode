class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack();
        for(char c:num.toCharArray()){
            while(!st.isEmpty() && st.peek()> c && k>0) {
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        res.reverse();
        while(res.length()>1 && res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }
        if(res.length()==0) return "0";
        return res.toString();
    }
}