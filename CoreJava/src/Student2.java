
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Student2 {
    static{
        System.out.println("Welcome");
        Date date=new Date();
        System.out.println(date);
    }
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter pass to continue");
        String pass=sc.next();
        if(pass.equals("1234"))
        {
            System.out.println("Correct");
            System.out.println("1.Yes");
            System.out.println("1.NO");
           
            System.out.println("1.BOTH");
            byte choice=sc.nextByte();
            switch(choice)
            {
                case 1:
            JOptionPane.showMessageDialog(null,"Leo");
        break;
                case 2:
            JOptionPane.showMessageDialog(null,"cap");
        break;
                case 3:
            JOptionPane.showMessageDialog(null,"scor");
        break;
        
            }
//            JOptionPane.showMessageDialog(null,"Correct");
        }
        else{
            System.out.println("Incorrect");
           //5 JOptionPane.showMessageDialog(null,"WRONG");
        Runtime run =Runtime.getRuntime();
//        run.exec("C:\\Windows\\System32\\rundll32.exe user32.dll,LockWorkStation");
         run.exec("C:\\Windows\\System32\\rundll32.exe user32.dll,LockWorkStation");
            
        }
    }
    
         
}
