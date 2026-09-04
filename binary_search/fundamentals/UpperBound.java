import java.util.*;
public class UpperBound {
    public static int upperBound(int arr[],int target)
    {

        int low=0,high=arr.length-1,ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return high+1;
    }
     public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target  ");
        int target=sc.nextInt();
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+i+"th element");
            arr[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(upperBound(arr,target));

    }
    
}
