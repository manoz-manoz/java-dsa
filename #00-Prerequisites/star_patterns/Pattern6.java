
/*
    Program to print a hollow square of n rows.

    Example for n = 5:

    *****
    *   *
    *   *
    *   *
    *****
*/

import java.util.Scanner;

class Pattern6 {

    static void pattern(int n) {

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        pattern(n);

        sc.close();
    }
}
