import java.util.Scanner;
class fact
{
    public static void main(String args[])
    {
        int num;
        int sum=1;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
        sum=i*sum;
        
        
        }
    System.out.println("factorial is:"+sum);

    }
}