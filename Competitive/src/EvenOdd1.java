
import java.util.Scanner;

public class EvenOdd1 {
public static void main(String[] args) {
   Scanner sc =new Scanner (System.in);
   long n=sc.nextLong();
   long a=sc.nextLong();
   long x=0;
   long z=0;
   long  y=0;
  
   if(n%2==0)
   {
   x=n/2;
//   y=n/2;
   if(a>x)
   {
   y=a-x;
   z=2*y;
   }
   else if(a<=x)
   {
       y=2*a;
       z=y-1;
   }
   }
   else{
       x=(n+1)/2;
//   y=n/2;
   if(a>x)
   {
   y=a-x;
   z=2*y;
   }
   else if(a<=x)
   {
       y=2*a;
       z=y-1;
   }
   }
   
    System.out.println(z);
   
}    
}
