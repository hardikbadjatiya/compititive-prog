
import java.util.Scanner;

public class VasyaHipster {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int m=sc.nextInt();
   int n=sc.nextInt();
   if(m>=n)
   {
       System.out.println(n);
       System.out.println((m-n)/2);
   }
   else if(n>m)
   {
       System.out.println(m);
       System.out.println((n-m)/2);
       
   }
   
}
    
}
