import java.util.*;
public class P5_GreatestOfTwoNumbers {
    //using if else
    public static void method1(int n1,int n2){
        if(n1>n2)
            System.out.println(n1+" is greater than "+n2);
        else
            System.out.println(n2+" is greater than "+n1);


    }

    //using ternary operator
    public static void method2(int n1,int n2)
    {
        System.out.println((n1>n2)?n1+" is greater than "+n2:n2+" is greater than "+n1);
    }
    //using subraction
    public static void method3(int n1,int n2)
    {
        int diff=n1-n2;
        if(diff>0)
            System.out.println(n1+" is greater than "+n2);
        else
            System.out.println(n2+" is greater than "+n1);
    }
    
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int n1=sc.nextInt();
        System.out.println("Enter num2");
        int n2=sc.nextInt();
        System.out.print("Using if else :\t");
        method1(n1,n2);
        System.out.print("Using ternary operaor :\t");
        method2(n1,n2);
        System.out.println("Using Math.max() :\t"+Math.max(n1,n2)+" is greater than "+Math.min(n1,n2));
        System.out.print("Using sutbraction :\t");
        method3(n1,n2);
    



    }
    
}
