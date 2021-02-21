import java.util.*;

public class lengthofstring {
    

    public static void main(String[] args)
    {
         Scanner in=new Scanner(System.in);
         System.out.println("enter any String:");
         String s=in.nextLine();
        
         String s1="";
        System.out.println(s1.length());

        int i=0,c=0;
        char[] a=s.toCharArray();
        for(char t:a)
        {
            c++;
            
        }
        System.out.println("length of string "+s+"  is  "+c);
            


}}
