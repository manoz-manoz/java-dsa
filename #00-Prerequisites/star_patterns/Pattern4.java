/*
    Program to print an inverted right-angled triangle of n rows.

    Example for n = 5:

    *****
    ****
    ***
    **
    *

*/
import java.util.Scanner;

class Pattern4 {

    static void pattern(int n) {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        pattern(n);
    }
}