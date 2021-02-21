public class removehyphen {
    

    public static void main(String[] args)
    {
        StringBuilder s=new StringBuilder("134-10/5566 A-block,Manyata Tech-Park ");
       

         for(int i=1;i<s.length()-1;i++)
         
         if(s.charAt(i)=='-'  &&  Character.isDigit(s.charAt(i-1)) && Character.isDigit(s.charAt(i+1)))
                {  
                      s.deleteCharAt(i);
                      //System.out.println(i);
                }
        System.out.println(s);

                
         }
    
}
