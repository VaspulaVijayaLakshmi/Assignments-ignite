import java.util.*;

public class II_largestnum {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any three numbers");
        
          int n1=in.nextInt();
          int n2=in.nextInt();
          int n3=in.nextInt();

          if(n1>n2 && n1>n3)
          {
             if(n2>n3)
             System.out.println(n2+ " is second largest element");

             else
             System.out.println(n3+ " is second largest element");

          }

          else if(n2>n1 && n2>n3)
          {
            if(n1>n3)
             System.out.println(n1+ " is second largest element");

             else
             System.out.println(n3+ " is second largest element");
          }

          else
          {
            if(n1>n2)
            System.out.println(n1+ " is second largest element");

            else
            System.out.println(n2+ " is second largest element");
          }

          
         

}
}
