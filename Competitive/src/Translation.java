
import java.util.Scanner;

public class Translation {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str1=new String();
   
   str1=sc.next();
   String str2=new String();
   str2 =sc.next();
   StringBuilder sb=new StringBuilder(str1);
   String str=new String(sb.reverse());
   if(str.equals(str2))
   {
       System.out.println("YES");

   }
else
   {
       System.out.println("NO");
   }
}
    
}
