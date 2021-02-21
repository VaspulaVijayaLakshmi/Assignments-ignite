import java.util.*;

public class reversenum {
   
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  number");
          int n=in.nextInt();
             String temp=" ";

             

          while(n>0)
          {
              int rem=n%10;
               temp=temp+rem;
               n=n/10;

          }

      
          System.out.println("reveresed number = "+temp);

}
}
