class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int target=threshold * k;
        int left=0,right=0,count=0,sum=0;
        while(right<k)
        {
            sum+=arr[right++];

        }
        if(sum>=target)
        count++;
        while(right<arr.length)
        {
            sum-=arr[left++];
            sum+=arr[right++];
            if(sum>=target)
            count++;

        }
        return count;
    }
}