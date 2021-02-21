import java.util.*;

public class linearseach {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int[] a=new int[100];

        System.out.println("Enter size of array:");
          int n=in.nextInt();

          System.out.println("Enter  array elements :"); 
        for(int i=0;i<n;i++)
          a[i]=in.nextInt();

        System.out.println("Enter element to be found in array:");
          int n1=in.nextInt();
         int flag=0;
          int i=0;

          for(;i<n;i++)
              if(a[i]==n1)
                 { flag=1;
                    break; 
                } 

    
                if(flag==1)
                System.out.println("element  found in array at :"+i); 

                else
                System.out.println("element not found ");
                in.close();
}
}
