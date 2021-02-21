import java.util.*;

public class q16 {
  
    
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=in.nextInt();
        
        
        int c=0,k=1;
        System.out.print(k+" , ");
       int j=1;
        for(int i=1;i<n;i++)
        {
            
            if(c==2)
            {
                j++;
              
                c=0;
            }
          
            k=k+4*j;
            j++;
             c++;
            System.out.print(k+" , ");

        }


}}
