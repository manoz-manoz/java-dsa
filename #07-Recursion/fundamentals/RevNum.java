class RevNum{
    public static int rev(int num,int rev){
        if (num==0)
        return rev;
        rev+=num%10;
        return rev(num/10,(num/10)>0?(rev)*10:rev);

    }
    public static void main(String ar[])
    {
        System.out.println(rev(9452,0));

    }
}