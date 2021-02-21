import java.io.*;

public class copyfiledata {
    
    public static void main(String[] args)
    {
          //String s="JAVA ASSIGNMENT";
          System.out.println("copying contents from createfile1.txt to copy.txt:");
          
          try{

          File f=new File("createfile1.txt");
          File f1=new File("copy.txt");
         
         FileInputStream fin=new FileInputStream(f);
         byte[] b1=new byte[100];
        
         fin.read(b1);

         FileOutputStream fout=new FileOutputStream(f1);
         fout.write(b1);

         //checking if the contents sucessfully copied
         FileInputStream fin1=new FileInputStream(f1);
         int b=-1;
         while((b=fin1.read())!=-1)
         {
             System.out.print((char)b);
         }

          }

          catch(IOException e)
          {
              System.out.println("Error:"+e);
          }
          
    }

}

