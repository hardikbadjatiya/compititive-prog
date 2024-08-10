
import java.util.ArrayList;
import java.util.Scanner;

public class Sasas {
public static void main(String[] args) {
   Scanner sc=new  Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0){
       long n=sc.nextLong();
       long k=sc.nextLong();
       int o=0;
       if(n<=k&&k!=1)
       {
           o=1;
           System.out.println("1");
       }
       
       else if(o==0){
           long q=0;
           
                    
          for(long i=1;i<=(long)Math.sqrt(n);i++)
          {
              if(n%i==0)
              {
                  if(i<=k)
              q=Math.max(q, i);
              if(n/i<=k)
                  q=Math.max(q, n/i);
              }
              
          }
           System.out.println(n/q);
          
        
       }
   } 
}
    
}
