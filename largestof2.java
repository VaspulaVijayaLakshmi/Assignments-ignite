import java.util.*;

public class largestof2 {
   
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any two numbers");
          int n1=in.nextInt();
         
          int n2=in.nextInt();

          int max=n1>n2?n1:n2;
          System.out.println("Largest of two numbers is : "+max);

}
}
