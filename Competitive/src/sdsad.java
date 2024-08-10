
import java.util.Scanner;

public class sdsad {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long a=sc.nextLong();
       long b=sc.nextLong();
       long n=sc.nextLong();
       long h=(n/a)*a;
       if(h+b<=n)
       {
           
           System.out.println(h+b);
       }
       else{
           System.out.println(h-a+b);
       }
       
   }
}
    
}
