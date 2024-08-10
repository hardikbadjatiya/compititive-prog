
import java.util.Scanner;

public class Perf {
    static long gcd(long b,long x) 
{ 
    
    if (x >=b)
            
         return x;
    
    return gcd1(x+3,b); 
    
} 
    static long gcd1(long b, long f) 
{ 
    
    if (b >=f) 
        return gcd(f,b );
    else
        return gcd(f, 2*b); 
    } 
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int k=0;k<n;k++)
   {
       long p=sc.nextLong();
   if(p==1)
   {
       System.out.println(1);
   }
   else{
       long w=Perf.gcd(p,2);
  
   
   if(w%2==0)
      System.out.println(w+3);
   else
           System.out.println(w);
   }
   }
}
    
}
