/*
    Program to print the following pattern for n rows.

    Example for n = 5
        *****
         ****
          ***
           **
            *
*/

import java.util.Scanner;

class Pattern9 {

    static void pattern(int n) {

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<n-i+1)
                    System.out.print(" ");
                else
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

        sc.close();
    }
}