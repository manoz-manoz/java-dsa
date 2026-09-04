import java.util.*;
class D_B{
    public static void main(String arrr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal value : ");
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(n>0)
        {
            sb.insert(0,n%2);
            n/=2;

        }
        System.out.println(sb);

    }
}