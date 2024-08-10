
import static java.lang.System.in;
import java.util.Scanner;

public class CheapHed {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int a=sc.nextInt();
   int b=sc.nextInt();
   int x=0;
   if((n*a)>((n/m)*b))
   {
       
   }
   x=(n/m)*b;
   int y=0;
   y=Math.min((n%m)*a,b);
//   y=(n%m)*a;
//    System.out.println(x+y);
     if((n*a)<(x+y))
   {
       System.out.println(n*a);
   }
     else{
         System.out.println(x+y);
     }
    
}
    
}
