class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int total_subsets=(1<<nums.length);
        List<List<Integer>> power_set=new ArrayList<>();

        for(int num=0;num<total_subsets;num++)
        {
            List<Integer> subset=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                if((num&(1<<i))!=0)
                subset.add(nums[i]);
            }
            power_set.add(subset);
        }
        return power_set;
        
    }
}