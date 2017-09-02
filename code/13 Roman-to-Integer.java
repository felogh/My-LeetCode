class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int res = getInt(s.charAt(0)), i = 0;
        
        for(i = 1;i < len;i++){
            if(getInt(s.charAt(i)) <= getInt(s.charAt(i-1))){
                res += getInt(s.charAt(i));
            } else {
                res = res - 2 * getInt(s.charAt(i-1)) + getInt(s.charAt(i));
            }
        }
        return res;
    }
    
    public int getInt(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}





/*
** 一开始竟然给我报错
class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int res = 0, i = 0;
        for(i = 0;i < len-1;i++){
            if(getInt(s.charAt(i)) >= getInt(s.charAt(i+1))){
                res += getInt(s.charAt(i));
            } else {
                res -= getInt(s.charAt(i));
            }
        }
        res += getInt(s.charAt(i));
        return res;
    }
    
    public int getInt(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

*/