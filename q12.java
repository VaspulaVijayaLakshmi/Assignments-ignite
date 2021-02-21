import java.util.*;

public class q12 {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=in.nextInt();
      for(int i=1;i<=n;i++)
    {
      if(i%2==0)
      System.out.print(i+" , ");
      else
      System.out.print(-1*i+" , ");

    }
    
    }}