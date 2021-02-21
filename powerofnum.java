import java.util.*;

public class powerofnum {
    

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  number");
          int n=in.nextInt();
          System.out.println("Enter power:");
          int pow=in.nextInt();
          int n3=1;
          int pow1=pow;
          while(pow>0)
          {
            n3*=n;
            pow--;
          }

          System.out.println(n + " raised to power "+pow1+" = "+n3);
        }

}
