class Sum_Paramateric{
    public static int sum(int n,int sum)
    {
        if(n<1)
            return sum;
        return sum(n-1,sum+n);
    }
    public static void main(String ar[])
    {
        System.out.println(sum(3,0));
    }
}