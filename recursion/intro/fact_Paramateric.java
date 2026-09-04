public class fact_Paramateric {
    public static void fact(int n,int fact)
    {
        if(n<2){
            System.out.println(fact);
            return;
}
        fact(n-1,fact*n);
    }

    public static void main(String ar[])
    {
        int n=5;
        fact(n,1);
    }
    
}
