
import java.util.Scanner;

public class HandShake {
    static long gcd(long a, long b)
 {
     if(a==0)
         return b;
     else
         return gcd(b%a,a);
 }
    
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long x=sc.nextLong();
   long y=sc.nextLong();
   long p=sc.nextLong();
   long q=sc.nextLong();
long a=Math.max(x,p);
long b=Math.min(x,p);
long c=Math.max(y,q);
long d=Math.min(y,q);
  
long hcf=gcd(a,b);
long hcf2=gcd(c,d);
//long hcf3=gcd(p,q);
//long lcm= (p*q)/hcf3;

long lcm1=(a*b)/hcf;
long l1=lcm1/p;
long lcm2=(c*d)/hcf2;

long l2=lcm2/q;

long hc=gcd(l1,l2);
long l3=(l1*l2)/hc;
long u1=l3*p/x;
long u2=l3*q/y;

 System.out.println(u1+" "+u2+" "+l3);

   
}
    
}
