import java.util.*;

public class  comparestrings{
    public static void main(String[] args)
    {
         Scanner in=new Scanner(System.in);

         
         System.out.println("enter any String:");
         String s1=in.nextLine();

         System.out.println("enter any String:");
         String s2=in.nextLine();

         if(s1.equals(s2))
         System.out.println("Strings are equal");
         else
         System.out.println("Strings are not equal");

         if(s1.compareTo(s2)==0)
         System.out.println("Strings are equal");
         else
         System.out.println("Strings are not equal");


        

    }}