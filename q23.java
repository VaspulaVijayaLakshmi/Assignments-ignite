import java.util.*;

public class q23 {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=in.nextInt();
        int even=-2;
        int odd=1;
        System.out.print(odd+" , "+even+" , ");
      for(int i=1;i<=n;i++)
    {
      if(i%2==0)
      {
          even=even-4;
          System.out.print(even+" , ");
      
          } 
             else
             {
                 odd=odd+3;             
                System.out.print(odd+" , ");
             }

    }
    
    }}