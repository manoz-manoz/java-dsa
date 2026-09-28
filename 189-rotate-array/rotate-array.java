class Solution {
    public static void rot(int nums[],int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
          int n = nums.length;
        k = k % n; 
        if (k < 0) {
            k = k + n; 
        }
        rot(nums,0,nums.length-k-1);
        rot(nums,nums.length-k,nums.length-1);
        rot(nums,0,nums.length-1);
        
    }
}