
import java.util.Scanner;
import java.math.BigInteger;
public class StrongNo {
 
static long check(long n, long x , long r) 
{  
    long w=0;
    for (long i = 2; i <=Math.sqrt(n); i++) 
    {
        
        if(n%i==0)
        {
          n=n/i;
          r++;
          if(r>=x-1)
          {
              return 1;
          }
          return check(n, x, r);
        }
    }
    return w;
    
} 
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   
     for(int k=0;k<t;k++)
   {
       long n=sc.nextLong();
       long x=sc.nextLong();
        
       if(x==1)
    {
        if(n>1)
        {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
       if(x==2){
       long p=0;
       long e=0;
       p=(long) Math.pow(2, x);
       
       if(n==p)
       {
       e=1;
       }
       else if(n<p){
           e=0;
       }
       else if(n>p){
           for(long i=2;i<=Math.sqrt(n);i++)
           {
               if(n%i==0)
               {
                   e=1;
                   break;
               }
           }
       }
       System.out.println(e);    
   }
       if(x>2)
       {
     long p=0;
       long e=0;
       p=(long) Math.pow(2, x);
       
       if(n==p)
       {
       e=1;
       }
       else if(n<p){
           e=0;
       }
       else if(n>p){
       e=check(n, x, 0);
       }
           System.out.println(e);
       }
   }
}
}