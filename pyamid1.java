import java.util.*; 

class pyramid1{

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        // System.out.println("Enter any number:");
          int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}