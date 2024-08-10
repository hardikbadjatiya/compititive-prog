
import java.util.Scanner;

public class Tesrt1 {
    static long gcd(long a, long b)
    {
        if(a==0)
            return b;
        else
        return gcd(b%a,a);
    }
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
     long a=sc.nextLong();
     long b=sc.nextLong();
     long c=sc.nextLong();
     long p=gcd(a,gcd(b,c));
     long y=(a/p)*(b/p)*(c/p);
       System.out.println(p +" "+y);
   }
}
    
}
