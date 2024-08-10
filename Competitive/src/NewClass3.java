
import java.util.Arrays;
import java.util.Scanner;

public class NewClass3 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int b=sc.nextInt();
       int m=sc.nextInt();
      int y=n/b;
       if(n%b!=0)
       {
           y=y+1;
       }
       int a[]=new int[y];
       int ab[]=new int[y];
       for(int i=0;i<y;i++)
       {
           int u=(b)*(i+1)-1;
           a[i]=Math.min(u, n-1);
       }
       int ar[]=new int[m];
       int x=0;
       int u=-1;
       for(int i=0;i<m;i++)
       {
           ar[i]=sc.nextInt();
           for(int j=0;j<y;j++)
           {
               if(ar[i]<=a[j])
               {
                   if(u!=j)
                   {
                       u=j;
                       ++x;
                   }
               }
           }
       }
       System.out.println(x);
       
       
   }
}
    
}
