import java.util.*;

public class q22 {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=in.nextInt();
        int q0=0,q1=1;

        System.out.print(q1+" , "+(q0+q1)+" , ");
        q0=1;
        int q3=0;
      for(int i=3;i<=n;i++)
    {
          q3=q1;
          q1= q0+q1;
          q0=q3;
          System.out.print(q1+" , ");

        
    }
    
    }}
