import java.util.*;

public class separatedecimalnum {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  number");
          String n=in.nextLine();

          int index=n.indexOf('.');

          String s1=n.substring(0,index);
          String s2=n.substring(index+1);

          System.out.println( s1+"   "+s2);


    }
    
}
