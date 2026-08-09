class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        map.put(i,map.getOrDefault(i,0)+1);

        int index=0;
        for(int i:nums)
        {
            if(map.containsKey(i))
            {
                int freq=Math.min(2,map.get(i));
                for(int j=0;j<freq;j++)
                nums[index++]=i;
            }
            map.remove(i);
        }
        return index;
        
    }
}