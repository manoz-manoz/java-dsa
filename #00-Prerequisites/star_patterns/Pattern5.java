
/*
    Program to print Floyd's Triangle of n rows.

    Example for n = 5:

    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15

*/

import java.util.Scanner;

class Pattern5 {

    static void pattern(int n) {
        int sum=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println("");
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
