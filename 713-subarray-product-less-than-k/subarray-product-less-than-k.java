class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int j=0,total=0,product=1;
        if(k<=1)
        return 0;
        for(int i=0;i<arr.length;i++)
        {
            product*=arr[i];
            while(j<arr.length&&product>=k)
            {
                product/=arr[j];
                j++;

            }
            total+=(i-j+1);
        }
        return total;
    }
}