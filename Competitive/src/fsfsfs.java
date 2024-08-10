
import java.util.Scanner;

public class fsfsfs {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long n=sc.nextLong();
       long k=sc.nextLong();
       if(n<=k)
       {
           System.out.println((n*(n-1))/2+1);
       }
       else{
           System.out.println((k*(k+1)/2));
       }
   }
}
    
}
