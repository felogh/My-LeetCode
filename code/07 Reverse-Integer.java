public class Solution {
    public int reverse(int x) {
        long res = 0, temp = 0;
        while(x != 0){
            temp = x % 10;
            x = x /10;
            res = res * 10 + temp;
            if(res < -2147483648 || res > 2147483647)
                return 0;
        }
        return (int)res;
    }
}