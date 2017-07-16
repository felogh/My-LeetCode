/*
 * ³¬Ê±µÄÒ»°æ
*/ 
/*
public class Solution {
    public String longestPalindrome(String s) {
        int i, j;
        int len = s.length();
        if(len == 0 || len == 1)
            return s;
        Boolean[][] dp = new Boolean[len][len];
        for(i = 0;i < len;i++)
            for(j = 0;j < len;j++)
                if(i >= j)
                    dp[i][j] = true;
                else
                    dp[i][j] = false;
        
        int k;
        int maxlen = 1;
        int head = 0, tail = 0;
        for(k = 1;k < len;k++){
            for(i = 0;i + k < len;i++){
                j = k + i;
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1];
                    if(dp[i][j]){
                        if(k + 1 > maxlen){
                            maxlen = k + 1;
                            head = i;
                            tail = j;
                        }
                        
                    }
                }
            }
        }
        return s.substring(head, tail+1);
    }
}
*/

public class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxlen = 0,start = 0;
        for(int i = 0;i < s.length();i++){
            dp[i][i] = true;
            maxlen = 1;
            start = i;
        }
        for(int i = 0;i < s.length()-1;i++)
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                maxlen = 2;
                start = i;
            }
        for(int len = 3;len <= s.length();len++)
            for(int i = 0;i < s.length()-len+1;i++){
                int j = i + len - 1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
                    dp[i][j] = true;
                    maxlen = len;
                    start = i;
                }
            }
        return s.substring(start, start+maxlen);
    }
}