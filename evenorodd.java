import java.util.*;


public class evenorodd {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  number");
          int n=in.nextInt();

          if(n==0||n==1)
          System.out.println("neither EVEN nor ODD");

          
          else
          if( (n & 1)!=0)
          System.out.println("ODD");
          
          else
          System.out.println("EVEN");


}
}
