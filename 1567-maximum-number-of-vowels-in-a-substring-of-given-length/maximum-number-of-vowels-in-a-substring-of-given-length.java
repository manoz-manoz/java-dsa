class Solution {
    public boolean isVowel(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) {
        int left=0,right=0,count=0,maxcount=0;
        while(right<k)
        {
            if(isVowel(s.charAt(right)))
            count++;
            right++;
        }
        maxcount=count;
        while(right<s.length())
        {
            if(isVowel(s.charAt(left)))
            count--;
            if(isVowel(s.charAt(right)))
            count++;

            left++;
            right++;
            maxcount=Math.max(count,maxcount);
        }
        
        return maxcount;
    }
}
