
import java.util.Scanner;

public class PrimeSubstraction {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   
   for(int i=0;i<n;i++)
   {
       long x=sc.nextLong();
       long y=sc.nextLong();
       if(( Math.max(x, y)- Math.min(x, y))>=2)
          {
       System.out.println("YES");
          }
      else {
          System.out.println("NO");
      }
      
      }
}
}
