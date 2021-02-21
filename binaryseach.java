import java.util.*;

public class binaryseach {
 
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
          int ele=in.nextInt();


         int ind=-1;

        int strt=0,end=n-1;
        while(strt<=end)
        {
           int mid=strt+(end-strt)/2;
           System.out.println(mid); 

           if(a[mid]==ele)
            {
                 
                ind=mid;
                break; 
            }

           else if(a[mid]>ele)
           end=mid-1;
           
           else if(a[mid]<ele)
           strt=mid+1;


        }
        if(ind==-1)
        System.out.println("element not found");

        else
        System.out.println("element  found in array at :"+ind); 



    }

}
