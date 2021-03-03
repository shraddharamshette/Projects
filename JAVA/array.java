import java.util.*;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int myarray[]=new int[4];
        boolean match=false;
        int target;
        System.out.println("enter the elements of array");
        for(int i=0;i<myarray.length;i++)
        {
           myarray[i]=sc.nextInt();

        }
         System.out.println("enter the target value");
        target=sc.nextInt();
        for(int i=0;i<myarray.length;i++)
        {
        for(int j=i+1;j<myarray.length;j++)
        {
               
        if(myarray[i]+myarray[j]==target)
        {
            System.out.println("target matched");
            System.out.println("target matched values are"+myarray[i]+"and"+myarray[j]);
           match=true;
        }
      
       }
       
    }
    if(match !=true)
    {
        System.out.println("no match found");
    }
    
        
    
        
    }
}