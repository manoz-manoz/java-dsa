class Solution {
    public int mySqrt(int x) {
        long start=0,end=x,ans=1,mid=0;
        if(x==0 || x==1)
        return x;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(mid*mid==x)
            {
                return (int)mid;
            }
            else if(mid*mid<x)
            {
                ans=mid;
                start=mid+1;
            }
            else
            end=mid-1;
        }
        return (int)ans;
    }
}