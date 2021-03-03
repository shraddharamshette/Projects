import java.util.*;
class student
{
    public static void main(String args[])
    {
    int java,cpp,py,total;
    float avg;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the marks of 3 subject");
    java=sc.nextInt();
    cpp=sc.nextInt();
    py=sc.nextInt();
    total=java+cpp+py;
    avg=total/3;
    System.out.println("total marks is:"+total);
    System.out.println("average marks is:"+avg);
    if(avg>=40&&cpp>=40&&py>=40)
    {
        if(avg>=80)
        {
        System.out.println("Grade:A");
        }
        else if(avg>=60)
        {
        System.out.println("Grade:B");
        }
        else if(avg>=40)
        {
        System.out.println("Grade:c");
        }

    }
    else
    {
        System.out.println("Fail...");
    }
    }
}