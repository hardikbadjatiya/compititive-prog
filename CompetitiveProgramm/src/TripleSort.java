
import java.util.Scanner;

public class TripleSort {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int k=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           
       }
       int x=0;
        
       if(n%4==1||n%4==0)
       {
           x=1;
           System.out.println(n/2);
           for(int i=1;i<=n/2;i++)
           {
               if(i%2!=0)
               System.out.println(i+" "+(n-i)+" "+(n-i+1));
               else
                   System.out.println(i+" "+(n-i+1)+" "+(n-i+2));
           }
       }
       else if(x==0)
       {
           System.out.println("-1");
       }
   }
}
    
}
