
import java.util.Scanner;

public class ettyt {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int  ar[]=new int[n];
       int  a[]=new int[n];
       int x=0;
       int y=0;
       int p=0;
       int l=0;
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           if(ar[i]==i+1)
           {
               ++x;
           }
           else{
               ++y;
           
           }
       }
       int q=0;
       for(int i=0;i<n;i++)
       {
           if(ar[i]!=i+1)
           {
         p=i;
         break;
           }
           
       }
       
       int o=0;
       for(int i=n-1;i>=0;i--)
       {
           if(ar[i]!=i+1)
           {
             q=i;  
            break;
           }
       }
       int op=q-p+1;
       for(int i=p;i<=q;i++)
       {
           if(ar[i]==i+1)
           {
             op--;  
           }
       }
     if(x==n&&y==0)
     {  System.out.println(0);
     }
     else if(x>0&&y>0)
     {
         if(op!=q-p+1)
         {
             System.out.println(2);
         }
         else{
         System.out.println(1);
     }
     }
     else if(x==0&&y>0)
     {
         System.out.println(1);
     }
   }
}
    
}
