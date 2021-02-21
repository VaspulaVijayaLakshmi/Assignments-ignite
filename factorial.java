import java.util.*;
import java.lang.*;


public class factorial {


    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  number");
          int n=in.nextInt();
          int fact=1;
          for(int i=1;i<=n;i++)
              fact*=i;
              System.out.println("factorial= "+fact);

          


    }   
}
