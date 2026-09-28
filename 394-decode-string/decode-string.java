class Solution {
    public String decodeString(String s) {
       Stack<Integer> nums=new Stack<>();
       Stack<String> str=new Stack<>();
       String curr="";
       int n=0;
       for(char c:s.toCharArray()){
        if(Character.isDigit(c))
            n=n*10+c-'0';
        else if(c=='['){
            str.push(curr);
            nums.push(n);
            n=0;
            curr="";
        }
        else if(c==']'){
            int count=nums.pop();
            String old=str.pop();
            String temp="";
            for(int i=0;i<count;i++){
                temp+=curr;
            }
            curr=old+temp;
        }
        else    curr+=c;
       }
       return curr;
    }
}