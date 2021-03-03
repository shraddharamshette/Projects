import java.util.*;
class sumdigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,sum,c;
        sum=0;
       
        c=num;
        
        System.out.println("enter a number");
        
        num=sc.nextInt();
        while(num>0)
        {
            
         c=num%10;
         sum=sum+c;
         num=num/10;

        
        
        }
        System.out.println("sum of digits is:"+sum);
        
    }  

}
