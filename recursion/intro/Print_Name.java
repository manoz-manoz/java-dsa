class Print_Name{
    public static void Print(int i,int n){
        if(i>=n)
            return;
        System.out.println("Manoz "+i);
        Print(i+1,n);
    }
    public static void main(String ar[])
    {
            Print(0,5);
    }
}