import java.util.*;

public class P7_LeapYear {

    // using if else
    public static void method1(int year) {

        if (year % 400 == 0)
            System.out.println(year + " is a leap year");
        else if (year % 100 == 0)
            System.out.println(year + " is not a leap year");
        else if (year % 4 == 0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }

    // using logical operators
    public static void method2(int year) {

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }

    // using ternary operator
    public static void method3(int year) {

        String result = (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0))
                ? " is a leap year"
                : " is not a leap year";

        System.out.println(year + result);
    }

    // using boolean variable
    public static void method4(int year) {

        boolean isLeapYear = year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0);

        if (isLeapYear)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }

    public static void main(String arr[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year : ");
        int year = sc.nextInt();

        System.out.print("Using if else :\t\t");
        method1(year);

        System.out.print("Using logical operators :\t");
        method2(year);

        System.out.print("Using ternary operator :\t");
        method3(year);

        System.out.print("Using boolean variable :\t");
        method4(year);

        sc.close();
    }
}