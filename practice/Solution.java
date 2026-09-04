import java.util.*;
class Solution{
    public static void reverse(int arr[],int a)
    {
        int left=0,right=arr.length-1;
        a=200;
        while(left<=right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String ar[])
    {
        int arr[]={1,2,3,4};
        int a=10;
        reverse(arr,a);
        System.out.println(Arrays.toString(arr));
        System.out.println(a);
        

    }
}