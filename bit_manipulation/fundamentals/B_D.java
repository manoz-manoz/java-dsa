import java.util.Scanner;

public class B_D {
     public static void main(String arrr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary value : ");
        String str=sc.next();
        int val=0;
        int n=0;
        while(n<str.length())
        {
            val+=Character.getNumericValue(str.charAt(n))*Math.pow(2,str.length()-1-n);
            n++;
        }
        System.out.println(val);

    }
}
