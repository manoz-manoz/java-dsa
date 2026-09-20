import java.util.*;
class P1_CheckPosNeg{
    public static void check(int n)
    {
        if(n>0)
            System.out.println("The number is positive");
        else if(n<0)
            System.out.println("The number is negative");
        else
            System.out.println("zero");

            
    }
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        check(n);


    }

}