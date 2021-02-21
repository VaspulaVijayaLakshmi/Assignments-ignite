import java.util.*;
import java.lang.*;

public class displaynuminwords {

     
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any  number");
          String n=in.nextLine();
          String s=" ";
              int l=n.length();
               
         for(int i=0;i<l;i++)
        {
            char arr=n.charAt(i);
            switch(arr)
            {
                case '0':
                s+="Zero ";
                break;
     
                case '1':
                s+="One ";
                break;
     
                case '2':
                s+="Two ";
                break;
     
     
                case '3':
                s+="Three ";
                break;
     
                case '4':
                s+="Four ";
                break;
     
     
                case '5':
                s+="Five ";
                break;
     
     
                case '6':
                s+="Six ";
                break;
     
     
                case '7':
                s+="Seven ";
                break;
     
     
                case '8':
                s+="Eight ";
                break;
     
                case '9':
                s+="Nine ";
                break;
             
     
            }
           

          }
          System.out.println("Words in string:  "+s);

}}
