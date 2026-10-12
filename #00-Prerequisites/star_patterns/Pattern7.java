/*
    Program to print the following pattern for n rows.

    Example for n = 3:

    1
    1 2
    1 2 3
*/

import java.util.Scanner;

class Pattern7 {

    static void pattern(int n) {

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
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