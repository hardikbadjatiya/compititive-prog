
import java.util.Scanner;

public class Points {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String st=sc.next();
   int n=st.length();
   int x=0;
   for(int i=0;i<n;i++)
   {
     if(st.charAt(i)!='1'||st.charAt(i)!='4')
     {
         System.out.println("NO");
         System.exit(0);
     }
   if(st.charAt(i)=='4')
   {
       if (st.charAt(i-1)=='4')
       {
           if(st.charAt(i-2)!='1')

           {
               System.out.println("NO");
               System.exit(0);
           }}
       
   }
}
   System.out.println("YES");
}
        
}
