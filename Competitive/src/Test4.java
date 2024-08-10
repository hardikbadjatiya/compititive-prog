
import java.util.Scanner;

public class Test4 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       String st=sc.next();
       String s="";
       int n=st.length();
       if(n==2)
       {
          s=s+st;
       }
       else{
           int x=0;
           for(int i=0;i<n;i++)
           {
               if(i%2==0)
               {
               s=s+st.charAt(i);
               }
           }
           if(n%2==0)
           {
              s=s+st.charAt(n-1);
           }
           
           
       }
       System.out.println(s);
   }
}
    
}
