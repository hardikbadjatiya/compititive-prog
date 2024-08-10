
import java.util.Scanner;

public class KeyRaces {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int v1=sc.nextInt();
   int v2=sc.nextInt();
   int t1=sc.nextInt();
   int t2=sc.nextInt();
   if((2*t1+n*v1)>(2*t2+n*v2))
   {
       System.out.println("Second");
   }
   if((2*t1+n*v1)<(2*t2+n*v2))
   {
       System.out.println("First");
   }
   if((2*t1+n*v1)==(2*t2+n*v2))
   {
       System.out.println("Friendship");
   }
   
   
}
    
}
