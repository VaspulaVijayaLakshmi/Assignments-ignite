import java.util.*;

class zipcodes{

    ArrayList<Integer> a;

    zipcodes()
    {
         a =new ArrayList<Integer>();
        a.add(123);
        a.add(456);
        a.add(567);
        a.add(265);
        a.add(987);
        a.add(234);

    }

     static void validzipcode()
     {
         System.out.println("VALID ZIPCODES:");
         zipcodes zips=new zipcodes();
        
         for(int zip:zips.a)
         {
              System.out.println(zip);
         }

     }

    
}


class invalidZipCode extends Exception{

    invalidZipCode()
    {
        System.out.println("INVALID ZIP CODE");

    }

   void  errormsg()
   {
    System.out.println("please enter valid codes");
    zipcodes zips=new zipcodes();
     zips.validzipcode();
   }
}


public class swiggy {


    public static void main(String[] args)
    {
         Scanner in=new Scanner(System.in);
         zipcodes zips=new zipcodes();
        // zips.validzipcode();
         System.out.println("Enter any valid  zipcode:");
         int zip=in.nextInt();

         try{

         if(zips.a.contains(zip))
         System.out.println("DELIVERY AVAILABlE IN YOUR AREA");
         else
         throw new invalidZipCode();
         }
         catch(invalidZipCode e)
        {
             e.errormsg();
        }

  
         
         
}}
