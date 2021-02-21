import java.util.*;

public class sumofodd_even {
    
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  number");
          int n=in.nextInt();
       int sum1=0;
       int sum2=0;
       for(int i=1;i<=n;)
       {
         sum1+=i;
         i+=2;
       }

       for(int i=2;i<=n;)
       {
         sum2+=i;
         i+=2;
       }
       System.out.println("EVEN SUM: "+sum2);
       System.out.println("ODD SUM: "+sum1);
      
    }
}
