public class SumOfDigits {
    public static int sod(int num)
    {
        if(num<=0)
            return 0;
        return num%10+sod(num/10);

    }
    public static void main(String ar[])
    {
        System.out.println(sod(91));
    }
    
}
