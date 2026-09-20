import java.util.Scanner;

class P3_Sum_N{
    //for loop
    public static void way1(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
            sum+=i;
        System.out.println(sum);

    }
    //using recursion
    public static int way2(int n)
    {
        if (n==0)
        return 0;
        return n+way2(n-1);
    }

    //using mathematical formula
    public static void way3(int n){
        System.out.println(n*(n+1)/2);
    }

    //using arithmetic pairing (two pointers)
    public static void way4(int n)
    {
        int first=1,last=n;
        int sum=0;
        while(first<=last)
        {
            sum=sum+first+last;
            first++;
            last--;
            
        }
        System.out.println(sum);
    }

    public static void main(String ar[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        
        System.out.println("Using For Loop       : " );
         way1(n);
        System.out.println("Using Recursion      : "+way2(n) );
         
        System.out.println("Using Formula        : " ); 
        way3(n);
        System.out.println("Using Pairing(two pointers)       : " );
         way4(n);


    }
}