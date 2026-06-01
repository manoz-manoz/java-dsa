class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int len=arr.length+1;
        int j=0,sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            while(sum>=target)
            {
                len=Math.min(len,i-j+1);
                sum-=arr[j++];
            }

        }
        return len==arr.length+1?0:len;
    }
}