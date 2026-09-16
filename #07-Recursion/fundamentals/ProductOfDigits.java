public class ProductOfDigits {
    public static int pod(int num)
    {
        if(num<=0)
            return 1;
        return num%10*pod(num/10);

    }
    public static void main(String ar[])
    {
        System.out.println(pod(1662));
    }
    
}
