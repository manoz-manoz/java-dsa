import java.util.*;
class P2_Even_Odd{
    //using modulus operation
    public static void way1(int n)
    {
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    //using bitwise operator &
    public static void way2(int n)
    {
        if((n&1)==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        way1(n);
        way2(n);

        
    }
}