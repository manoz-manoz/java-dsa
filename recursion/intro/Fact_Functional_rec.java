public class Fact_Functional_rec {
    public static int fact(int n)
    {
        if(n<2)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String ar[])
    {
        System.out.println(fact(5));
    }
}
