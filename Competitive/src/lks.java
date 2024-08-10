
import java.util.Scanner;

public class lks {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long n=sc.nextLong();
       long m=sc.nextLong();
       long x=0;
      int o=0;
       while(n>=1)
       {
           x=x+(long)Math.pow((n/2+n%2),2);
           n=n/2;
           
       }
       System.out.println(x%m);
       
       
   }
}
    
}
