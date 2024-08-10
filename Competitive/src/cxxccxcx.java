
import java.util.Scanner;

public class cxxccxcx {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String st=sc.next()  ;
   String s=sc.next();
   int o=0;
   int r=0;int m=0;
   for(int i=0;i<n;i++)
   {
   if(s.charAt(i)=='r') ++r;
   }
   m=n-r;
   for(int i=0;i<n;i++)
   {
       if(st.charAt(i)=='m')
       {
           if(m>0)
           {
               m--;
           }
           else{
               o=n-i;
               break;
           }
       }
       
       if(st.charAt(i)=='r')
       {
           if(r>0)
           {
               r--;
           }
           else{
               o=n-i;
               break;
           }
       }
       
   }
    System.out.println(o);
}
    
}
