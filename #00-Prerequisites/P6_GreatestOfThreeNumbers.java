import java.util.*;

public class P6_GreatestOfThreeNumbers {

    // using if else
    public static void method1(int n1, int n2, int n3) {

        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is greatest");
        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is greatest");
        else
            System.out.println(n3 + " is greatest");
    }

    // using ternary operator
    public static void method2(int n1, int n2, int n3) {

        int greatest = (n1 > n2)
                ? ((n1 > n3) ? n1 : n3)
                : ((n2 > n3) ? n2 : n3);

        System.out.println(greatest + " is greatest");
    }

    // using Math.max()
    public static void method3(int n1, int n2, int n3) {

        int greatest = Math.max(Math.max(n1, n2), n3);

        System.out.println(greatest + " is greatest");
    }

    // using running maximum
    public static void method4(int n1, int n2, int n3) {

        int greatest = n1;

        if (n2 > greatest)
            greatest = n2;

        if (n3 > greatest)
            greatest = n3;

        System.out.println(greatest + " is greatest");
    }

    public static void main(String arr[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1 : ");
        int n1 = sc.nextInt();

        System.out.println("Enter num2 : ");
        int n2 = sc.nextInt();

        System.out.println("Enter num3 : ");
        int n3 = sc.nextInt();

        System.out.print("Using if else :\t\t");
        method1(n1, n2, n3);

        System.out.print("Using ternary operator :\t");
        method2(n1, n2, n3);

        System.out.print("Using Math.max() :\t\t");
        method3(n1, n2, n3);

        System.out.print("Using running maximum :\t");
        method4(n1, n2, n3);

        sc.close();
    }
}