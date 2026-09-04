import java.util.*;
class Solution {
    public int[] sortedSquares(int[] arr) {
        int i=0,j=arr.length-1;
        int temp[]=new int[j+1];
        int index=j;
       while(i<=j)
        {
            int max=Math.max(Math.abs(arr[i]),arr[j]);
            temp[index--]=max*max;
           if(max==Math.abs(arr[j]))
                j--;
            else
            i++;

        }
        return temp;
    }
}