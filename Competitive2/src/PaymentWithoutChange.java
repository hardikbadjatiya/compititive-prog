
import java.util.Scanner;

public class PaymentWithoutChange {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   for(long i=0;i<n;i++)
   {
       long a=sc.nextLong();
       long b=sc.nextLong();
       long p=sc.nextLong();
       long s=sc.nextLong();
       long f=s/p;
       long h=s%p;
       if(h>b||s>(a*p+b))
       {
           System.out.println("NO");
       }
       else{
           System.out.println("YES");
           
       }
   }
}
    
}
