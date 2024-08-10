
import java.util.Scanner;

public class oli {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       String st=sc.next();
       int n=st.length();
       int o=0;
       int z=0;
       for(int i=0;i<n;i++)
       {
          if(st.charAt(i)=='1')
              ++o;
          else
              ++z;
       }
       if(o==n||z==n)
       {
           System.out.println("NET");
       }
       else{
          int y=Math.min(o,z);
          if(y%2==1)
          {
              System.out.println("DA");
          }
          else{
              System.out.println("NET");
          }
       }
       
  
   }
       }
    
}
