class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int i=0,count=0,mcount=0;
        while(i<arr.length)
        {
            if(arr[i]==1){
            count++;
            
            }

            else{
            mcount=Math.max(count,mcount);
            count=0;}
            i++;
        }
        return Math.max(count,mcount);
    }
}