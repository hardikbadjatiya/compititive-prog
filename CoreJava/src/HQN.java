
import java.util.Scanner;

public class HQN {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str=new String();
   str=sc.next();
   if(str.contains("H")||str.contains("Q")||str.contains("9"))
   {
       System.out.println("YES");
       
   }
   else
   {
       System.out.println("NO");
   }
       }
    
}
