
import java.util.Scanner;

public class sdsdsdsd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       String st=sc.next();
       int x=0;
       int e=0;
       for(int i=0;i<n;i++)
       {
          if(st.charAt(i)=='(')
          {
              
              ++x;
          }
        if(st.charAt(i)==')')
        {
          if(x>0)
          {
              e=e+2;
              x--;
          }
        }
       }
       System.out.println((n-e)/2);
   }
}
    
}
