import java.util.*;
class RotateArray
{
   public static void bruteforce(int[] arr,int k ){
    k=k%arr.length;
        for(int i=0;i<k;i++)
        {
            int last=arr[arr.length-1];

            for(int j=arr.length-1;j>0;j--)
            {
               arr[j]=arr[j-1];

            }
            arr[0]=last;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void optimal(int[] arr,int k )
    {
        k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        System.out.println("Array"+Arrays.toString(arr));
        
    }
    public static void reverse(int arr[],int left,int right)
    {
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        bruteforce(arr,101);
        optimal(arr,10);




    }

}