class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int distance=arr[0]+arr[1]+arr[2];
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
        {
            int left=i+1;
            int right=arr.length-1;
            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target)
                    return sum;
                    if((Math.abs(target-sum))<(Math.abs(target-distance)))
                distance=sum;
             if(sum>target){
                    right--;}
                else{
              
                    left++;}
            }

        }
            return distance;
    }
}