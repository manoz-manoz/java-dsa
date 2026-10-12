/*
    Program to print a right-angled star pattern for n.
    n=5
    Pattern:
    *
    **
    ***
    ****
    *****

   
*/
import java.util.Scanner;

public class Pattern3 {
    public static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String ar[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n=sc.nextInt();
        pattern(n);
    }
}
