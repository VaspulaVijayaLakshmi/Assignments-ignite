import java.util.*;

public class simpleinterst {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter pricipal amount:");
          int amount=in.nextInt();
          
         System.out.println("Enter intrest:");
         int intrest=in.nextInt();

         System.out.println("Enter years:");
         int yrs=in.nextInt();

        System.out.println("amount accumulated="+(amount+intrest*yrs));
    
}
}
