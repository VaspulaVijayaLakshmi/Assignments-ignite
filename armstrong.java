import java.util.*;

public class armstrong {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any 3 digit number:")
        int n=in.nextInt();
        int sum=0;

        if((n/100)>0)
        {
            int n1=n;
          while(n>0)
          {
              int rem=n%10;
              sum+=Math.pow(rem,3);
              n=n/10;
          }
             if(sum==n1)
             System.out.println("given number is an armstrong number");
             
             else
             System.out.println("given number is an not armstrong number");

        }

        else
        {
            System.out.println("enter 3 digit number");
        }

    }
    
}
