
import java.util.Scanner;

public class WaterBuying {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int k=sc.nextInt();
   for(int i=0;i<k;i++)
   {
       long n=sc.nextLong();
       long a=sc.nextLong();
       long b=sc.nextLong();
       if(b>2*a){
           System.out.println(n*a); 
       }
       if(b>a&&b<=2*a)
       {
           System.out.println(((n/2)*b)+((n%2)*a));
       }
       if(b<=a)
       {
           System.out.println(((n/2)*b)+((n%2)*a));
       }
   }
   
}
        
}
