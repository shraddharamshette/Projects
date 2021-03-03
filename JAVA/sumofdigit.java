import java.util.*;
class sumofdigit
{
    public static void main(String args[])
    {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        num=sc.nextInt();
        int i=1;
        while(i<=num)
        {
            sum=sum+i;
            i++;
        
        }
        System.out.println("sum of digit in:"+sum);

    }
}