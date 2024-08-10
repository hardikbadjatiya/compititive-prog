
import java.util.Scanner;

public class Sas {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long n=sc.nextLong();
       long k=sc.nextLong();
       long sum=0;
       sum=sum+(n*(n+1))/2;
       while(n>=1)
       {
           n=n/k;
           sum=sum-k*(n*(n+1))/2;
           sum=sum+(n*(n+1))/2;
       }
       System.out.println(sum);
   }
}
    
}
