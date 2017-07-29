public class Solution {
    public boolean isPalindrome(int x) {
        int len = String.valueOf(x).length();
        String str = String.valueOf(x);
        for(int i = 0;i < len / 2;i++)
            if(str.charAt(i) != str.charAt(len-1-i))
                return false;
        return true;
    }
}