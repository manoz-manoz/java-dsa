import java.util.*;
class Swap{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A  Value: ");

        int a=sc.nextInt();
        System.out.println("Enter B Value : ");

        int b=sc.nextInt();
        System.out.println("A : "+a+"\t B : "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("A : "+a+"\t B : "+b);

    }
}