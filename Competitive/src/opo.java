
import java.math.BigInteger;
import java.util.Scanner;

public class opo {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
      long m=sc.nextLong();
      long k=sc.nextLong();
      long ar[]=new long[n];
      for(int i=0;i<n;i++)
      {
          ar[i]=sc.nextLong();
      }
      String s=""+ar[0];
     BigInteger a 
            = new BigInteger(s); 
      for(int i=1;i<n;i++)
      {
          long r=ar[i];
       String w=""+ar[i];
       BigInteger b 
            = new BigInteger(w); 
          a=(a.multiply(b)).divide(a.gcd(b));
          
      }
      
      String o=""+m;
      BigInteger we 
            = new BigInteger(o); 
      BigInteger d 
            =  a.mod(we);
     String e=""+d;
     long q=Long.parseLong(e);
      long y=(long) Math.pow(q,k)% m;
     System.out.println(y);
   }
}
    
}
