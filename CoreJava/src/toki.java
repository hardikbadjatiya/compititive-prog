
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

public class toki {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int o=n%4;
   if(o==0)
   {
       System.out.println("1 A");
   }
   if(o==1)
   {
       System.out.println("0 A");
   }if(o==2)
   {
       System.out.println("1 B");
   }if(o==3)
   {
       System.out.println("2 A");
   }
}
    
}
