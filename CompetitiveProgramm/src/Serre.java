
import java.util.Scanner;

public class Serre
{
     static long printNcR(long n, long r) { 
  
        long p = 1, k = 1; 
  
        if (n - r < r) { 
            r = n - r; 
        } 
  
        if (r != 0) { 
            while (r > 0) { 
                p *= n; 
                k *= r; 
  
                // gcd of p, k  
                long m = __gcd(p, k); 
  
                p /= m; 
                k /= m; 
  
                n--; 
                r--; 
            } 
  
            // k should be simplified to 1  
            // as C(n, r) is a natural number  
            // (denominator should be 1 ) .  
        } else { 
            p = 1; 
        } 
  
        // if our approach is correct p = ans and k =1  
      return p;
     } 
  
    static long __gcd(long n1, long n2) { 
        long gcd = 1; 
  
        for (long i = 1; i <= n1 && i <= n2; ++i) { 
            // Checks if i is factor of both integers 
            if (n1 % i == 0 && n2 % i == 0) { 
                gcd = i; 
            } 
        } 
        return gcd; 
    } 
    static long nCr(long n, long r) 
{ 
    return fact(n) / (fact(r) * 
                  fact(n - r)); 
} 
  
// Returns factorial of n 
static long fact( long n) 
{ 
    long res = 1; 
    for (long i = 2; i <= n; i++) 
        res = res * i; 
    return res; 
} 
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long a=sc.nextInt();
       long b=sc.nextInt();
       long c=sc.nextInt();
       long d=sc.nextInt();
       if(a==c||b==d)
       {
       if(a==c&&b==d&&a==b)
       {
           System.out.println(0);
       }
       else{
           System.out.println(1);
       }
       }
       else if(a!=c&&b!=d){
           long q=Math.abs(a-c);
           long w=Math.abs(b-d);
           long l=q+w;
           long as=nCr(l, q);
           System.out.println(as);
                      
       }
       
   }
}
    
}
