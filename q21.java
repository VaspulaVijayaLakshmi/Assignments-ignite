import java.util.*;

public class q21 {
  
    
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=in.nextInt();
        int k=1;
        System.out.print(k);
        for(int i=1;i<=n;i++)
            {
                k=k+(i*i);
                if(i%2!=0)
                System.out.print(" , "+-1*k);
                else
                System.out.print(" , "+k);

            }

    }}     
        