import java.util.Scanner;
public class LowerBound {
    public static int lowerBound(int arr[],int target)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;

    }
     public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter target to found ");
        int target=sc.nextInt();
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+i+"th element");
            arr[i]=sc.nextInt();

        }

        System.out.println(lowerBound(arr,target));

    }
}
