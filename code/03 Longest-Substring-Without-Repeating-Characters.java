public class Solution {
    static int[] last = new int[128];
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int max = 0;
        char[] w = new char[s.length()];
        w = s.toCharArray();
        for(int i = 0;i < 128;i++)  last[i] = -1;
        for(int i = 0;i < s.length();i++){
            if(last[w[i]] >= start){
                if(i - start > max)
                    max = i - start;
                start = last[w[i]] + 1;
            }
            last[w[i]] = i;
        }
        if(max > s.length() - start)    return max;
        else    return s.length() - start;
    }
}