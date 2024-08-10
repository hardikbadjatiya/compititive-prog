
import java.util.Scanner;

public class olu {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       
       String x=Integer.toBinaryString(n);
       
       System.out.println(x.length());
   }
}
    
}
