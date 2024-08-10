
import java.util.Scanner;

public class sdsddssd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long a=sc.nextLong();
       long b=sc.nextLong();
       if(a>=b)
       {
           System.out.println(a);
       }
       if(b>a)
       {
           System.out.println("-1");
       }
   }
}
    
}
