
import java.util.Scanner;

public class FrogJumping {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       long a=sc.nextInt();
       long b=sc.nextInt();
       long k=sc.nextInt();
       long d=sc.nextInt();
       if(a==k)
       {
           System.out.println(a+" "+(a+1));
       }
       else{
           System.out.println(a+" "+k);
       }
   }
}
    
}
