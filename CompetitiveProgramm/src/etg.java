
import java.util.Scanner;

public class etg {
public static void main(String[] args) {
   Scanner sc=new  Scanner(System.in);
   String st=sc.next();
   int l=0;
   int r=0;
   for(int i=0;i<st.length();i++)
   {
       if(st.charAt(i)==')')
       {
           l++;
           
       }
       if(st.charAt(i)=='(')
       {
           r++;
           
       }
   }
    System.out.println(Math.min(l,r));
}
    
}
