class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int i=0;
        double sum=0;
        while(i<k)
        {
            sum=sum+arr[i++];

        }
        double msum=sum;
        while(i<arr.length)
        {
            sum=sum+arr[i]-arr[i-k];
            i++;
            msum=Math.max(sum,msum);
        }
        return msum/k;
    }
}