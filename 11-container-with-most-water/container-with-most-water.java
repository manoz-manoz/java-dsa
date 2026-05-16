class Solution {
    public int maxArea(int[] height) {
        int area=0,marea=0,i=0,j=height.length-1;
        while(i<j)
        {
            area=(j-i)*Math.min(height[i],height[j]);
            marea=Math.max(area,marea);
            if(height[i]<height[j])
                i++;
            else
                j--;
            
            
        }
        return marea;
        
    }
}