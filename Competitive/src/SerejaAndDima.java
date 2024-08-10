
import java.util.Scanner;

public class SerejaAndDima {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   }
   int m;
   int p;
   int a=0;
   int b=0;
   for(int i=0;i<(n+1)/2;i++)
   {
     m=Math.max(ar[i],ar[n-1-i]);
     p=Math.min(ar[i], ar[n-1-i]);
     if(ar[i]>ar[n-1-i])
     {
         a=a+m;
         b=b+p;
         System.out.println(a);
     }
     else
     {
         a=a+p;
         b=b+m;
         System.out.println(b);
     }
   }
    System.out.println(a+" "+b);

}
    
}
