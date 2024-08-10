
import java.util.Scanner;

public class rere {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       String st=sc.next();
       int n=st.length();
       int r=0;
       int s=0;
       int p=0;
       for(int i=0;i<n;i++)
       {
           if(st.charAt(i)=='R')
           {
               ++r;
           }
           if(st.charAt(i)=='S')
           {
               ++s;
           }
           if(st.charAt(i)=='P')
           {
               ++p;
           } 
       }
       String sl="S";
       
       if(s>p)
       {
        sl="R";
       }
       
      else if(r>p&&r>s)
       {
           sl="P";
       }
       String pq="";
           for(int i=0;i<n;i++)
              pq=pq+sl;
      
       
       System.out.println(pq);
   }
}
    
}
