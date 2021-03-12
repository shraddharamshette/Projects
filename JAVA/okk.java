import java.util.*;
class okk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,rev,temp;
        int original=0;
        System.out.println("Enter the number");
        num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            rev=num%10;
            original=(original*10)+rev;
            num=num/10;
        }    
        if(temp==original)
        {
            System.out.println(temp+"\n is the palindrome number");             
        }
        else
        {
            System.out.println(temp+"\n is not the palindrome number");
        }
    }

}
