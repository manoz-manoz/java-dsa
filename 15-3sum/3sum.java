import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> hs=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
           if (i != 0 && nums[i] == nums[i-1]) continue;
            if (nums[i] > 0) break;
            int l=i+1,r=nums.length-1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                     List<Integer> ls=new ArrayList<>();
                    ls.addAll(List.of(nums[i],nums[l],nums[r]));
                    Collections.sort(ls);
                    hs.add(ls);
                    l++;
                    r--;
                }
                else if(sum > 0)
                r--;
                else
                l++;
            }
        }
        return  new ArrayList<>(hs);
    }
}