
import java.util.Scanner;

public class PetyaStrings {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str1=sc.next();
   String str2=sc.next();
   String str3=str1.toLowerCase();
   String str4=str2.toLowerCase();
   
   if(str3.equals(str4))
   {
       System.out.println("0");
   }
   else if(str3.compareTo(str4)<0)
   {
       System.out.println("-1");
   }
   else if(str3.compareTo(str4)>0)
   {
       System.out.println("1");
   }
       

}
    
}
