class PrintNto1{
    public static void print(int n)
    {
        if(n==0)
            return;
        System.out.print(n+ " ");
        print(n-1);
    }

    public static void printrev(int n)
    {
        if(n==0)
            return;
        printrev(n-1);
        System.out.print(n+ " ");
    }

   public static void main(String ar[]) 
   {
    print(5);
    System.out.println();
    printrev(5);

   }
}