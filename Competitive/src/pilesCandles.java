
import java.util.Scanner;

public class pilesCandles {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       long x=sc.nextLong();
       long y=sc.nextLong();
       long z=sc.nextLong();
       long s=(x+y+z)/2;
       System.out.println(s);
   }
}
        
}
