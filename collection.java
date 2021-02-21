import java.util.*;

class Member
{
    String name;
    String clg;
    int age;
    String[] skillset;
    
    Member(String nm,String col,int Age,String[] skills)
    {
         name=nm;
         clg=col;
         age=Age;
         
        for(int i=0;i<skills.length;i++)
        skillset[i]=skills[i];

    }
}

/*
class Department
{
    
    HashMap<String,ArrayList<Member>> hp;
    
    Department()
    {
        hp=new HashMap<String,ArrayList<Member>>();
    }
    
  
}*/

public class copy{
    
    

     public static void main(String []args)
     {

        HashMap<String,ArrayList<Member>> hp=new HashMap<String,ArrayList<Member>>();;

        Scanner in=new Scanner(System.in);
         int choice;

         System.out.println("Press the option(MENU) : ");
        System.out.println("1. DISPLAY ALL DEPARTMENTS WITH IT'S MEMBERS");
        System.out.println("2. DISPLAY  DEPARTMENTS AVAILABEL");
        System.out.println("5.  DISPLAY MEMBERS OF DEPARTMENT");
        System.out.println("4. DELETE DEPARTMENT");
        System.out.println("3. CREATE  DEPARTMENT");
        System.out.println("6.  CREATE A MEMBER AND ADD TO DEPARTMENT");
        System.out.println("7. EXIT");


        do{

       
        System.out.println("Enter any option:");
        choice=in.nextInt();

     // Department d=new Department();
      String dep="";
      //ArrayList<Member> a=new ArrayList<Member>(); 

      switch(choice)
      {
          
         case 1:
             
            
             for(String k:hp.keySet())
             {
                 System.out.println("Department: "+k);
                 
                 ArrayList<Member> member=hp.get(k);
                 
                 for(Member s : member)
                 {
                     
                     System.out.println("Name:   "+s.name);
                     System.out.println("College:   "+s.clg);
                     System.out.println("Age:    "+s.age);
                     System.out.println("Skillset :  ");
                     
                     
                      for(String skill: s.skillset)
                      {
                          System.out.println(skill);
                      }
                     
                 }
                 
                 System.out.println();
                 System.out.println();
                 System.out.println();
                 
             }
             
             break;
             
             
             
             
             case 2:  
             System.out.println("Departments : ");
             for(String k:hp.keySet())
             {
                 System.out.println(k);
             }
             
             break;
             
             



             
             case 3:
             System.out.println("create a Department: ");
             
             dep=in.next();
                 hp.put(dep,new ArrayList<Member>());

             break;
                 
             



             case 4:
                
                 dep=in.next();
                 
                 ArrayList<Member> arr=hp.get(dep);
                 
                     for(Member s : arr)
                     {
                     System.out.println("Name:   "+s.name);
                     System.out.println("College:   "+s.clg);
                     System.out.println("Age:    "+s.age);
                     System.out.println("Skillset :  ");
                     
                     
                      for(String skill: s.skillset)
                      {
                          System.out.println(skill);
                      }
                     }
                     
            break;
                 
             


             
             
             case 5:
             System.out.println("Enter the department u want to remove:");
                  dep=in.next();
                  hp.remove(dep);
             break;
             
                 
                 
                 
                
             

                 
             case 6:
                 
                 System.out.println("enter Name:");
                   String name=in.next();
                    in.nextLine();

                System.out.println("enter College:   ");
                   String clg=in.next();
                   

                System.out.println("enter Age:    ");
                   int age=in.nextInt();

                     System.out.println("enter any 3 Skillsets :");
                 
                String[] s=new String[3];
                
                for(int i=0;i<3;i++)
                { s[i]=in.next();
                    //in.nextLine();
                }
                 
                 Member m=new Member(name,clg,age,s);

                 
                 System.out.println("Departments: ");
                 for(String k  :hp.keySet())
                 {
                     System.out.println(k);
                 }


                 System.out.println("Assign a department for this new member(any choice): "); 
                 String ch=in.next();

                 
                 hp.get(ch).add(m);
                // a1.add(m);
                // hp.put(ch,a1);
                       
            break;
                 


                 case 7:
                 break;
      }
      
    }while(choice<7);
      
     }
     
     
    
}
