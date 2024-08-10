
import java.util.Scanner;

public class lki {
     static long mod(long l, long m) 
    { 
        long po = m; 
        long y = 0;
        long x = 1; 
        while (l > 1) 
        { 
            long q =l/m; 
            long t =m; 
            m=l% m; 
            l=t; 
            t=y; 
            y = x -q*y; 
            x = t; 
        } 
       if (x < 0) 
            x += po; 
  
        return x; 
    } 
  
    static long gcd(long a,long b)
    {
        if(a==0)
            return b;
        else
            return gcd(b%a,a);
    }
   
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int l=sc.nextInt();
   while(l-->0)
   {
       long n=sc.nextLong();
       long m=sc.nextLong();
       long t=sc.nextLong();
       long e=1;
       for(long i=n;i>=Math.min(n-t+1,n-m+1);i--)
       {
           e=e*i;
       }
       long k=1;
       for(long i=Math.min(n-t, n-m);i>=n-m-t+1;i--)
       {
           k=k*i;
       }
       
       long u=e-k;
       System.out.println(u+" "+e);
       long o=gcd(u,e);
    
       u=u/o;
       e=e/o;
       
       long y=mod(e,1000000007);
              long p=(y%1000000007)*(u%1000000007);

       System.out.println(p%1000000007);

   }
}
    
}
