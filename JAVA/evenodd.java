import java.util.*;
class evenodd
{
    public static void main(String args[])
    {
        int i=1;
        int num,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        num=sc.nextInt();
       
        while(i<=num)
        {
            if(i%2==0)
            {
                result=i*i;
                System.out.println("even is"+result);
            }
           
            else
            {
                result =i*i;
                System.out.println("odd is"+result);
            }
           i++; 
        }
    }
}
