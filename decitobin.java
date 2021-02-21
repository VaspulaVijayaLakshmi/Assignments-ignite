import java.util.*;
import java.lang.*;

public class decitobin{


    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  number");
          int n=in.nextInt();
         String s=" ";

         while(n>0)
         {
            s+=n%2;
            n=n/2;
         }
         StringBuilder s1=new StringBuilder(s);
         s1.reverse();
         System.out.println("binary value of :" + " is " +s1);

    }}