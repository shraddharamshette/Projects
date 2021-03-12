import java.util.*;
class sumdigit
{
    public static void main(String args[])
    {
       
        while(true)
        {
            int num,sum,c;
            sum=0;
            Scanner sc=new Scanner(System.in); 
            System.out.println("enter a number");
            
            num=sc.nextInt();
             if(num<0)
                {
                    System.out.println("please enter positive number");
            
                }
        
            while(num>0)
                {  
                    c=num%10;
                    sum=sum+c;
                    num=num/10;
                }
            System.out.println("sum of digits is:"+sum);    
        } 
    }  
}
