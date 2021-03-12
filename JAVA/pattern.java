import java.util.*;
class pattern
{
    public static void main(String args[])
    {
    int i;
    int j;
    String k="1";
    String var="";
    Scanner sc=new Scanner(System.in);

        for(i=1;i<=6;i++)
        {
            if(i==1)
            {
            System.out.println(k);
            }
            else
            {
             k=k+""+i+""+(i+1);
                System.out.println(k);
                k=k+""+i;
            }
           var=var+""+i+""+i;
           System.out.println(var);
            
        }
              System.out.println();
    }
}