class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i=0,j=cardPoints.length-1,sum=0,msum=0;
        while(i<k)
        {
            sum+=cardPoints[i++];
        }
        msum=sum;
        i=0;
        while(i<k)
        {
            sum-=cardPoints[k-1-i];
            sum+=cardPoints[j-i];
            msum=Math.max(sum,msum);
            i++;

        }
        return msum;
    }
}