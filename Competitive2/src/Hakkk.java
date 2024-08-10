
import java.util.Scanner;

public class Hakkk {
 public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   long n=sc.nextLong();
   long p=sc.nextLong();
   if(Math.max(n,p)%Math.min(n, p)==0)
   {
       int x=2;
   
   for(long i=2;i<=Math.min(n, p)/2;i++)
   {
       if(n%i==0&&p%i==0)
       {
           n=n/i;
           p=p/i;
           
               x=x+2;
       }
   }
   System.out.println(x);
     
   }
   else{
       int x=1;
   for(long i=Math.min(n, p)/2;i>=2;i--)
   {
     if(n%i==0&&p%i==0)
       {
     long y=n/i;
     long z=p/i;
     
     if(n%y==0&&p%z==0&&n%z==0&&p%y==0)
     {
       
     }
     else{
         x=x+1;
     }
     System.out.println(n+" "+p+" "+i+" "+x);
       }
   }
     System.out.println(x);
        }
 }
   
}
