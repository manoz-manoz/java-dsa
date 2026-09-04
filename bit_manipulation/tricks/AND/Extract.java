import java.util.*;
public class Extract {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.print("Enter no of bits to extract : ");
        int bits=sc.nextInt();
        System.out.println(Integer.toBinaryString((n&(1<<bits)-1)));


    }

    
}
