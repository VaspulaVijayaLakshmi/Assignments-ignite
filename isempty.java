import java.util.*;

public class isempty {
    
public static void main(String[] args)
{

   
         Scanner in=new Scanner(System.in);
         System.out.println("enter any String:");
         String s=in.nextLine();


         if(s.isEmpty())     //s.length()==0
         System.out.println("String is empty");
         else
         System.out.println("String is not  empty");
}
    
}
