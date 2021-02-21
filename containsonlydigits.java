import java.util.*;

public class containsonlydigits {
   
    public static void main(String[] args)
    {
         Scanner in=new Scanner(System.in);
         System.out.println("enter any String:");
         String s=in.nextLine();

         try{
             
            
            int i=Integer.parseInt(s);
             System.out.println("String only contains digits");

         }  
         catch(Exception e)
         {
             System.out.println("String contains alphanumeric characters");
             //e.printStackTrace();
         }


    }

}
