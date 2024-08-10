
import java.util.Scanner;

public class LargestDivisor {
    static long check(long n,long k)
    {
        if(n%k==0)
        {
            return check(n/k, k);
        }
        return n;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long n=sc.nextLong();
       long k=sc.nextLong();
       
       long o=0;
       for(long i=1;i<=n;i++)
       {
           o=o+check(i, k);
       }
       long a=(long) (Math.log(n)/Math.log(k));
     
       for(int i=0;i<a;i++)
       {
           
       }
      while(n>=k)
      {
       long p=(n*(n+1))/2;
        n=n/k;
      }
       System.out.println(o);
    }
   
}
    
}
