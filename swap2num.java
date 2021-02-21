import java.util.*;

public class swap2num {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any two numbers");
          int n1=in.nextInt();
         
          int n2=in.nextInt();
          System.out.println("before swapping: "+n1+"    "+n2);
          
          int temp=n1^n2;
          n1=temp^n1;
          n2=temp^n1;
          
          System.out.println("After swapping: "+n1+"  "+n2);

}
}