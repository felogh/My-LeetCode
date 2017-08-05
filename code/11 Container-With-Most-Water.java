public class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int i = 0, j = height.length-1;
        while(i < j){
            int temp = height[i] > height[j] ? height[j] * (j-i) : height[i] * (j-i);
            if(temp > res)  res = temp;
            if(height[i] < height[j])   i++;
            else    j--;
        }
        return res;
    }
}