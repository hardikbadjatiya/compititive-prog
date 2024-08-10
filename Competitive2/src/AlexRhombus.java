
import java.util.Scanner;

public class AlexRhombus {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   if(n==1)
   {
       System.out.println("1");
   }
   if(n==2)
   {
       System.out.println("5");
   }
   if(n>=3)
   {
       System.out.println((n*n)+((n-1)*(n-1)));
   }
}
    
}
