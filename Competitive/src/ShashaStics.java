
import java.util.Scanner;

public class ShashaStics {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long n=sc.nextLong();
   long k=sc.nextLong();
   long q=n/k;
   long r=n%k;
   if(q%2==0)
   {
       System.out.println("NO");
   }
   else{
       System.out.println("YES");
   }
}
    
}
