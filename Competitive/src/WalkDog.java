
import java.util.Scanner;

public class WalkDog {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   int x=0;
   for(int i=0;i<n;i++)
   {
       int z=sc.nextInt();
       if(k-z>=0)
       {
          k=k-z;
           ++x;
       }
       
   }
    System.out.println(x);
}
    
}
