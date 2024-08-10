
import java.util.Scanner;

public class Esad {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   while(a-->0)
   {
       int n=sc.nextInt();
      long  s=0;
       for(int i=0;i<n/2-1;i++)
       {
           s=s+(long)Math.pow(2, i+1);
       }
       s=s+(long)Math.pow(2,n);
       long q=0;
       for(int i=n/2;i<n;i++)
       {
           q=q+(long)Math.pow(2, i);
       }
       System.out.println(Math.abs(s-q));
   }
}
    
}
