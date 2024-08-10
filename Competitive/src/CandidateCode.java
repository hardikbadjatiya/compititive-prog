/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
  
  
static long nCr(long n, long r) 
{ 
    return fact(n) / (fact(r) * fact(n - r)); 
} 
  
// Returns factorial of n 
static long fact(long n) 
{ 
    long res = 1; 
    for (long i = 2; i <= n; i++) 
        res = res * i; 
    return res; 
} 
 
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc=new Scanner (System.in);

   long f=sc.nextLong();
   
   int  a=sc.nextInt();
   int  b=sc.nextInt();
   int  c=sc.nextInt();
   long h=0;
       for(int i=1;i<=f;i++)
       {
           long p=1;
           if(i%2==1)
           {
               
           for(int j=0;j<=f-i;j++)
           {
                 p=1;
              if(j%2==0)
              {
               p=p*nCr(f,i)*a;
               
               if(j>0)
               {
           p=p*nCr((f-i),j)*b; 
               }
               if(f-i-j>0)
               {
                   p=p*c;
               }
               h=h+p;
               
              }
           }
           }  
       }
       System.out.println(h);  
   }
}
