class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> s=new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            int left=i+1;
            int right=arr.length-1;
            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0)
                {
                    List<Integer> x=new ArrayList<>();
                    x.add(arr[i]);
                    x.add(arr[left]);
                    x.add(arr[right]);
                    s.add(x);
                    left++;

                }
                else if(sum>0)
                right--;
                else
                left++;
            }


        }
        return new ArrayList<>(s);
        
    }
}