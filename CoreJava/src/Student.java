
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.String;
public class Student {
 static 
 {
     System.out.println("Welcome");
     Date date =new Date();
     System.out.println(date);
 }
    public static void main(String[] args)throws Exception {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Password to continue..");
        String password=sc.next();
        if(password.equals("hardik"));
        {
            System.out.println("enter Student name");
            String student= sc.next();
            System.out.println("enter college name");
            String collname=sc.next();
            if(collname.equals("IET"))
            {
                System.out.println("___Companies List");
                           System.out.println("1.feedbox");
                System.out.println("2.Edu");
                System.out.println("kick");
                System.out.println("Select choice to explore more");
                byte choice =sc.nextByte();
                switch(choice)
                        {
                    case 1:
                        JOptionPane.showMessageDialog(null,"abc123");
                        break;
                     case 2:
                        JOptionPane.showMessageDialog(null,"def123");
                     break;
                     
                     case 3:
                        JOptionPane.showMessageDialog(null,"ghi123");
                     break;
                        
                }

                
                
            }
        
            else
              //System.out.println("Not available");
               // JOptionPane.showMessageDialog(null, "Not Available");
               {
               System.out.println("Invalid ID");
                Runtime run=Runtime.getRuntime();
       run.exec("C:\\Windows\\System32\\rundll32.exe user32.dll,LockWorkStation");
            }
        }
          
                
                
    
    }
}

        
        

