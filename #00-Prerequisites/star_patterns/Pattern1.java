/*
    Program to print '*' n times in a single line.

    Example for n = 5:
    *****
*/
import java.util.*;
class Pattern1{
    public static void pattern(int n)
    {
        for(int i=0;i<n;i++)
            System.out.print("*");
    }
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n=sc.nextInt();
        pattern(n);
        
    }
}