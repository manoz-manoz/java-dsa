
/*
    Program to print the following triangle pattern for n rows.

    Example for n = 4:

         1
         0 1
         1 0 1
         0 1 0 1

*/

import java.util.Scanner;

class Pattern11 {

    static void pattern(int n) {
        int digit=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            
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
