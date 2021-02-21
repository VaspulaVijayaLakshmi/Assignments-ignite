import java.util.*;

public class palindrome {
 
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  string");
          String n=in.nextLine();

         int c=0;
          
         int len=n.length();
          

         for(int i=0;i<len/2;i++)
         {

          //  System.out.println(n.charAt(i));
          //  System.out.println(n.charAt(len-i-1));
           if(n.charAt(i)==n.charAt(len-i-1))
                c++;
                
         }
          
        // System.out.println(c);
         //System.out.println(len/2);
         if(c==len/2)
         System.out.println("palindrome");

         else
         System.out.println(" not palindrome");

        }   


}
