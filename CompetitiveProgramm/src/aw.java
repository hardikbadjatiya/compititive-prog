
import java.util.Scanner;

public class aw {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long s=sc.nextInt();
       long d=sc.nextInt();
      long a=Math.max(s,d);
      long b=Math.min(s,d);
         long h=(s+d)/3;
         if(h>b)
         {
             h=b;
         }
          
       System.out.println(h);
       
   }
}
    
}
