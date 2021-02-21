import java.util.*;

public class reversestring {
   
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  string");
          String n=in.nextLine();
         
          String s1=" ";
         int len=n.length();

         for(int i=len-1;i>=0;i--)
         {
             s1+=n.charAt(i);
         }

        System.out.println("reversed string: "+s1);
    }
}
