class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int maxLen = 0;
        int i = 0;
        
        while (i < s.length()) {
            int count0 = 0, count1 = 0;
            
            // Count consecutive 0s
            while (i < s.length() && s.charAt(i) == '0') {
                count0++;
                i++;
            }
            
            // Count consecutive 1s
            while (i < s.length() && s.charAt(i) == '1') {
                count1++;
                i++;
            }
            
            // Balanced substring length is twice the smaller count
            maxLen = Math.max(maxLen, 2 * Math.min(count0, count1));
        }
        
        return maxLen;
    }
}
