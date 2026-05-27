class Solution {
    public int longestOnes(int[] arr, int k) {
        int left=0,max=0,zerocount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            zerocount++;

            while(zerocount>k)
            if(arr[left++]==0)
                zerocount--;
            
            max=Math.max(max,i-left+1);


        }
        return max;
    }
}