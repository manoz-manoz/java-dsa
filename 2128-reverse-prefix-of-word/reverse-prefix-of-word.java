class Solution {
  
    public String reversePrefix(String word, char ch) {
        
       char arr[]=word.toCharArray();
       int right=word.indexOf(ch);
       int left=0;
       if (right!=-1)
       {
       while(left<right)
       {
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
       }
       return new String(arr);
       }
        return word;
        
    }
}