class Solution {

    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> aIndices=findOccur(s,a);
        List<Integer> bIndices=findOccur(s,b);
        List<Integer> ans=new ArrayList<>();

        int j=0;

        for(int i: aIndices){

            while(j< bIndices.size() && bIndices.get(j)<i-k){ 
                j++;
            }

            if(j< bIndices.size() && bIndices.get(j)<=i+k){
                ans.add(i);
            }
        }
        return ans;


    }
    public List<Integer> findOccur(String text, String pattern){
        List<Integer> indices=new ArrayList<>();

        int[] lps=createLps(pattern);

        int i=0, j=0;

        while(i<text.length()){
            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
            }

            if(j==pattern.length()){
                indices.add(i-pattern.length()); //add current match index

                j=lps[j-1]; // search for next matches
            }
            else if(i<text.length() && text.charAt(i)!=pattern.charAt(j)){
                if(j>0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
            
        }
        return indices;

        

    }
    public int[] createLps(String pattern){
        int[] lps=new int[pattern.length()];

        int i=1, len=0;

        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len>0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }

            }

        }
        return lps;
    }
}