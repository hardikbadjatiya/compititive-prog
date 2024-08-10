
import java.util.ArrayList;
import java.util.Scanner;

public class NewClass2 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
      int ar[]=new int[n];
      int y=-1;
      int a[]=new int[10000000];
      int max=-1;
      int min=1000000000;
      for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           a[ar[i]]=1;
           if(ar[i]>max)
           {
               max=ar[i];
           }
           if(ar[i]<min)
           {
               min=ar[i];
           }
       }
       int u=0;
       int b=-1;
       int c=-1;
       int d=-1;
       int e=-1;
       for(int i=m+1;i<=1000000000;i++)
       {
           int g=0;
           
           if(a[i]==0)
           {
               if(u==0)
               {
                   g=1;
               ++u;
               d=i;
               }
               if(u==1&&g==0)
               {
                e=i;
                break;
               }
           }
       }
       
       for(int i=m-1;i>=0;i--)
       {
           int o=0;
          if(a[i]==0)
           {
               if(u==0&&o==0)
               {
               ++u;
               c=i;
               o=1;
               }
               if(u==1&&o==0)
               {
                b=i;
                break;
               }
           }
       }
       
       System.out.println(b+" "+c+" "+d+" "+e);
   }
}
    
}
