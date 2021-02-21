import java.util.*;

public class swap3num {
   
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any three numbers");
          int n1=in.nextInt();
          int n2=in.nextInt();
          int n3=in.nextInt();

          System.out.println("before swapping: "+n1+"    "+n2+"    "+n3);

          int temp=n1^n2^n3;
          n1=temp^n1^n2;
          n2=temp^n3^n2;
          n3=temp^n1^n2;

          System.out.println("after swapping: "+n1+"    "+n2+"    "+n3); 

    }
}
