import java.util.*;

public class primeno2 {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any two numbers");
        
          int n1=in.nextInt();
          int n2=in.nextInt();
          int a[]=new int[10];
          int k=0;


          for(int i=n1+1;i<n2;i++)
          {
              //checking if it is a prime number
              int c=0;
              for(int j=2;j<i;j++)
              {
                  if(i%j==0)
                  { 
                      c=1;
                      break;

                  }


              }
              if(c==0)
                a[k++]=i; 
              


          }

          for(int i=0;i<k;i++)
          System.out.println(a[i]);
    
}
}
