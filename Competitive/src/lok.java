
import java.util.Scanner;

public class lok {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   long ar[]=new long[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextLong();
       
   }
 
   for(int i=0;i<n;i++)
   {
      for(int j=0;j<n;j++)
      {
          if(j!=i&&ar[i]>0&&ar[j]>0&&ar[i]!=ar[j])
          {
         long h=ar[i]|ar[j];
         long k=ar[i]&ar[j];
         if(h*h+k*k>ar[i]*ar[i]+ar[j]*ar[j])
         {
           ar[i]=h;
           ar[j]=k;
         }
          }
      }
   }
   long e=0;
   for(int i=0;i<n;i++)
   {
       e=e+ar[i]*ar[i];
   }
    System.out.println(e);
       }
    
}
