
import java.util.Scanner;

public class gihnjk {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   long a[]=new long[n];
   long b[]=new long[k];
   for(int i=0;i<n;i++)
   {
       a[i]=sc.nextLong();
   }
   for(int i=0;i<k;i++)
   {
       b[i]=sc.nextLong();
   }
   long c[]=new long[n];
   
   for(int w=0;w<515;w++)
   {
       int o=0;
   for(int i=0;i<n;i++)
   {
       int kl=0;
       
     for(int j=0;j<k;j++)
     {
        if((w|(a[i]&b[j]))==w) 
        {
            kl=1;
            break;
        }
     }
     if(kl==0)
     {
        o=1; 
       break;
     }
   }
   if(o==0)
   {
       System.out.println(w);
       break;
   }
   }
  
}
       
}
