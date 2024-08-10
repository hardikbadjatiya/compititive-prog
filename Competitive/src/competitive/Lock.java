package competitive;

import java.util.Scanner;

public class Lock{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       String  str=sc.next();
       if(str.equals("cAPSlOCK"))
       {
           System.out.println("cAPSlOCK");
       }
       else{
      StringBuilder sb =new StringBuilder(str.toLowerCase());
              sb.delete(0,1);
        System.out.print(str.toUpperCase().charAt(0));
          System.out.print(sb);
       }
    }
    public void Capslock()
    {
     
      StringBuilder sb =new StringBuilder(str.toLowerCase());
              sb.delete(0,1);
        System.out.print(str.toUpperCase().charAt(0));
          System.out.print(sb);
       }
    }
  
}
