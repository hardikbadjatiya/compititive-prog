
import java.util.Scanner;

public class sdfgb {
   static long calca(long n ,long x, long num)
            
    {
        if(2*n<(3*x*x+x))
        {
            long k=(3*(x-1)*(x-1)+(x-1))/2;
            
            return k;
            
        }
        else{
            x=x+1;
            
            return calca(n,x,num);
            
        }
    }
public static void main(String[] args) {
   Scanner sc=new  Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long n=sc.nextLong();
       int o=0;
      while (n>=0)
      {
          if(n>=7)
          {
              
          long h =calca(n,1,0);
         n=n-h;
           ++o;
          }
          if(n<7&&n>=2)
          {
              n=n-2;
              ++o;
           }
          if(n<2)
          {
              break;
          }
          
      }
       System.out.println(o);
   }
}
    
}
