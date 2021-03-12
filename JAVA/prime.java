import java.util.*;
public class prime
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int num,i,flag=0;
    System.out.println("enter the number");
    num=sc.nextInt();
    int m=num/2;
    if(num==0||num==1)
    {
        System.out.println(num+"\tis not a prime number");
    }
    else
    {
        for(i=2;i<=m;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
    }
   if(flag==0)
   {
    System.out.println(num+"\tis not a prime number");
   }
   else
   {
    System.out.println(num+"\tis a prime number");
   }
}
}