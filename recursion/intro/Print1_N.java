class Print1_N{
    public static void Print(int i,int n)
    {
        if(i>n)
            return;
        System.out.print(i+"\t");
        Print(i+1,10);
    }
    public static void PrintN(int i,int n)
    {
        if(i>n)
            return;
        Print(i+1,10);
        System.out.print(i+"\t");
    }

    public static void main(String ae[])
    {
        Print(1,10);
        System.out.println();
        PrintN(1,10);
    }

}