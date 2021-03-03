import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        int a,b,c,num;
        int i=1;
        a=1;
        b=1;
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        System.out.println(""+a);
        System.out.println(""+b);
        while(i<=num)
        {
            c=a+b;
            a=b;
            b=c;
            i++;
            System.out.println(""+c);
        }
           
    }

}