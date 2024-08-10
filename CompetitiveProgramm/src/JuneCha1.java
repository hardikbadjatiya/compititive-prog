
import java.util.Scanner;

public class JuneCha1 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
      String st=sc.next();
      int n=st.length();
       int index = 0, count = 0;
        int y=0;
       for(int i=0;i<n-1;i++)
       {
           int u=0;
           if(i<n-1)
           {
           if(st.charAt(i)=='x'&&st.charAt(i+1)=='y'&&u==0)
           {
               ++y;
               i++;
               u++;
           }
           if(u==0)
           {
               if(st.charAt(i)=='y'&&st.charAt(i+1)=='x'&&u==0)
           {
               i++;
               ++y;
           }
           }
           }
       }
                        System.out.println(Math.max(y,count));
   
   }
       }
    
}
