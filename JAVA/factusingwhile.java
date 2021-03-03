import java.util.Scanner;
class factusingwhile
{
    public static void main(String args[])
    {
        int num;
        int sum=1;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num>0)
        {
        sum=num*sum;
        num--;
        
        }
    System.out.println("factorial is:"+sum);

    }
}