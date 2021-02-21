import java.io.File;
import java.io.IOException;

public class createfile {


    public static void main(String[] args)
    {
          System.out.println("creating a file:");
          File f=new File("createfile.txt");

          try{

            boolean b=f.createNewFile();
            if(b)
            System.out.println("file sucessfully created");
            else
            System.out.println("file already exists ");

          }

          catch(IOException e)
          {
              System.out.println("Error in creating file");
              e.printStackTrace();
          }


    }
    
}
