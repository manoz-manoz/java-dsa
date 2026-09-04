class Solution {
    public boolean isPalindrome(String s) {
        String x=s.replaceAll("[^a-zA-Z0-9]","");
        x=x.toLowerCase();
        System.out.println(x);
        int i=0,j=x.length()-1;
        while(i<j)
        {
            if(x.charAt(i)!=x.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}