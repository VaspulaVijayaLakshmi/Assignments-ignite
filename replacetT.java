import java.util.*;

public class replacetT {
    public static void main(String[] args)
    {
         Scanner in=new Scanner(System.in);

         
         System.out.println("enter any String:");
         String s=in.nextLine();

         char[] a=s.toCharArray();

         System.out.println("enter any character to be replaced:");
         char ch=in.next().charAt(0);

         System.out.println("enter any character to be replaced with :");
         char ch2=in.next().charAt(0);
         
        

         char ch1;

          if(Character.isUpperCase(ch))
            ch1=Character.toLowerCase(ch);
          else
          ch1=Character.toUpperCase(ch);


           //direct method
         //s.replace(ch,ch2);
        // s.replace(ch,ch1);

        for(int i=0;i<a.length;i++)
         {

             if(a[i]==ch || a[i]==ch1 )
             {
                 a[i]=ch2;
             }


         }
     s=String.valueOf(a);
       System.out.println(s);  

}}
