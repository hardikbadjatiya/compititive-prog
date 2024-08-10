
import java.util.Scanner;

public class ChefProduct {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
      long x=sc.nextLong();
      long y=sc.nextLong();
      long l=sc.nextLong();
      long r=sc.nextLong();
      
//       long max=0;
//       long min=Integer.MAX_VALUE;
//       
//       String xs=Integer.toBinaryString(x);
//       String ys=Integer.toBinaryString(y);
//       
//       int f=xs.length();
//       int g=ys.length();
//       int w=Math.min(f, g);
//       String s="";
       
//       long a=(long)Math.pow(2, Math.max(f, g))-1;
    long q=0;       
    if(x>0&&y>0)
       {
     q=x|y;
       
       }
       System.out.println(q);
   }
}
    
}
