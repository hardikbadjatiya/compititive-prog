
import java.util.Scanner;

public class KuroniSiimple {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String st=sc.next();
   String s="";
   int l=st.length();
   int o=0;
   int z=0;
   for(int i=0;i<l;i++)
   {
       if(st.charAt(i)=='(')
       {
           s=s+"0";
           ++o;
       }
        if(st.charAt(i)==')')
       {
           s=s+"1";
           ++z;
       }
   }
    
}
    
}
