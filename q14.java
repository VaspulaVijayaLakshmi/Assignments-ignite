import java.util.*;

public class q14 {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=in.nextInt();
        int x1=1,x2=4,x3=7;
        System.out.print(x1+" , "+ x2+" , "+x3+" , ");
          int x4;
        for(int i=4;i<=n;i++)
        {
            System.out.print((x1+x2+x3)+" , ");
            x4=x3;
            x3=x1+x2+x3;
            x1=x2;
            x2=x4;

        }


    
}}
