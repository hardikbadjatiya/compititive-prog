
import java.util.Scanner;

public class Code112 {
 
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int  t=sc.nextInt();
   while(t-->0)
   {
       long n=sc.nextLong();
       long x=1;
       for(int i=1;i<n;i++)
       {
           x=x+(long)Math.pow(2, i);
       if(n%x==0)
       {
           System.out.println(n/x);
           break;
       }
       
       }
   }
}
    
}
