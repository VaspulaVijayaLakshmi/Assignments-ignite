import java .util.*;

public class avgofarray {
 
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size :");
          int n=in.nextInt();

          int[] a=new int[10];

          System.out.println("Enter array elements :");
          for(int i=0;i<n;i++)
          a[i]=in.nextInt();

          double avg,sum=0;
          for(int i=0;i<n;i++)
                 sum+=a[i];

                 avg=sum/n;
                 System.out.println("average array elements : "+avg);    

}
}
