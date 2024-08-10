
import java.util.Scanner;

public class Grapes {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String st=sc.next();
  int l=st.length();
     int a=st.charAt(0);  
  if(st.charAt(0)>=53&&st.charAt(0)<=56)
       {
           System.out.print(57-a);
       }
       else{
           System.out.print(st.charAt(0));
       }
   for(int i=1;i<l;i++)
   {
        a=st.charAt(i);
       if(st.charAt(i)>=53)
       {
           System.out.print(57-a);
       }
       else{
           System.out.print(st.charAt(i));
       }
   }
}
    
}
