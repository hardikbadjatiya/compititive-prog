
import java.util.Scanner;

public class Contestofrobots {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int arr[]=new int[n];
   int c[]=new int[n];
   int p=0;
   int g=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   }
   for(int i=0;i<n;i++)
   {
       arr[i]=sc.nextInt();
   }
   for(int i=0;i<n;i++)
   {
       if(ar[i]<arr[i])
      {
          c[i]=0;
          g++;
      }
       if(ar[i]>arr[i])
      {
          p++;
          c[i]=2;
      }
   }
   
   for(int i=1;i<=n;i++)
   {
       if(p*i>g)
       {
           System.out.println(i);
           System.exit(0);
       }
   }
    System.out.println("-1");
 
   
}
    
}
