import java.util.*;
class Solution {
    static {
    Solution sol = new Solution();
    for (int i = 0; i < 100; i++) {
        sol.maxArea(new int[]{0, 0});
    }
}
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxarea=0;

        while(i<j)
        {
            int area=0;
            area=(j-i)*Math.min(height[i],height[j]);
            maxarea=Math.max(area,maxarea);
            if(height[i]<=height[j])
            {
                    i++;
            }
            else
            j--;

        }
        return maxarea;
        
    }
}