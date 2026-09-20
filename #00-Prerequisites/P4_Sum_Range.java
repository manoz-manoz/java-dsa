import java.util.Scanner;

class P4_Sum_Range{
    //using forloop
    public static int method1(int start,int end)
    {
        int sum=0;
        for(int i=start;i<=end;i++){
            sum+=i;

        }
    return sum;
    }
    //using recursion
    public static int method2(int start,int end)
    {
        if(start>end)
            return 0;
        return start+method2(start+1,end);
    }
     // 4. Using mathematical formula
     public static int method3(int start,int end){
        int count=end-start+1;
        return count*(end+start)/2;
     }

    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start value : ");
        int start=sc.nextInt();
        System.out.println("Enter end value : ");
        int end=sc.nextInt();
        System.out.println("Using  loop : "+method1(start,end));
        System.out.println("Using  recursion : "+method2(start,end));
        System.out.println("Using  Mathematical fomula  : "+method3(start,end));
        
    }
}