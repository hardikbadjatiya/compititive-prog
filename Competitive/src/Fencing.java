
import java.util.Arrays;
import java.util.Scanner;

public class Fencing {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   int a[]=new int[n-k+1];
   int b[]=new int[n-k+1];
   
   for(int i=0;i<n-k+1;i++)
   {
       int r=0;
      for(int j=i;j<n;j++)
      {
          ++r;
          if(r<=k)
          {
              a[i]+=ar[j];
              b[i]=i+1;
          }
      }
   }
   for(int j=0;j<n-k;j++)
   {
   for(int i=0;i<n-k;i++)
   {
       int x=0;
       int y=0;
       if(a[i+1]<a[i])
       {
           x=a[i];
           a[i]=a[i+1];
           a[i+1]=x;
           y=b[i];
           b[i]=b[i+1];
           b[i+1]=y;
       }
   }
   }System.out.println(b[0]);
   
}
    
}
