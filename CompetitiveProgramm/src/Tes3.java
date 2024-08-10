
import java.util.Scanner;

public class Tes3 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
 
   String st=sc.next();
   int n=st.length();
   for(int i=0;i<n;i++)
   {
       int o=st.charAt(i)-48;
       System.out.println(o);    
   }
   
}
    
}
