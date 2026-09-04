import java.util.*;
public class Check {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("Enter bit position to check ON or OFF ");
        int bit=sc.nextInt();
        System.out.println("Checking "+bit+" bit from left is 0 or 1"+" in "+n);
        System.out.println((n&(1<<bit))!=0?"ON":"OFF");
    }
    
}
