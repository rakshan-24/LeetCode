class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String arr[]=path.split("/");
        for(String i:arr){
            if(i.equals("..") && !s.isEmpty())  s.pop();
            else if(!i.equals("") && !i.equals(".") &&!i.equals(".."))
                s.push(i);
        }
        StringBuilder sb=new StringBuilder();
        for(String dir:s){
            sb.append("/");
            sb.append(dir);
        }
        return sb.length()==0?"/":sb.toString();
    }
}