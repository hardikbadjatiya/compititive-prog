
import java.util.Scanner;

public class Stsd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int p=0;p<t;p++)
   {
     long n=sc.nextLong();
     long k=sc.nextLong();
     long o=(long)Math.sqrt(2*k);
     long q=o;
      for(long tr=q;tr<q+3;tr++)
      {
          if((tr*(tr+1))>=2*k)
          {
              o=tr;
              break;
          }
      }
       long d=((o-1)*(o))/2;
     long w=k-d;
       
     for(long i=1;i<=n;i++)
     {
         if(i==(n-w+1)||i==n-o)
         {
         System.out.print("b");
             
         }
         else{
             System.out.print("a");
         }
     
     }
       System.out.println("");
}
}
}