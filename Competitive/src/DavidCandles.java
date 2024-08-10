
import java.util.Scanner;

public class DavidCandles {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int a1=sc.nextInt();
   int a2=sc.nextInt();
   int a3=sc.nextInt();
   int a4=sc.nextInt();
   int d=(a1+a2+a3+a4);
   if(2*(a1+a2)==d)
   {
       System.out.println("YES");
   }
   else  if(2*(a1+a3)==d)
   {
       System.out.println("YES");
   }
   else if(2*(a1+a4)==d)
   {
       System.out.println("YES");
   }
   else 
   if(2*(a2+a3)==d)
   {
       System.out.println("YES");
   }else if(2*(a2+a4)==d)
   {
       System.out.println("YES");
   }else if(2*(a3+a4)==d)
   {
       System.out.println("YES");
   }
   else if(a1+a2+a3==a4)
   {
       System.out.println("YES");
   }
   else if(a4+a2+a3==a1)
   {
       System.out.println("YES");
   }else if(a1+a2+a4==a3)
   {
       System.out.println("YES");
   }else if(a1+a4+a3==a2)
   {
       System.out.println("YES");
   }
   else {
       System.out.println("NO");
   }
}
    
}
