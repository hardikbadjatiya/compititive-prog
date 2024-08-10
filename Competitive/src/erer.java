
import java.util.Scanner;
import javafx.util.Pair;

public class erer {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int q=sc.nextInt();
   int h[]=new int[n];
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
       h[i]=sc.nextInt();
       
   }
   for(int i=0;i<n;i++)
   {
       a[i]=sc.nextInt();
   }
   
   for(int i=0;i<q;i++)
   {
    int x=sc.nextInt();
       int o=sc.nextInt();
       int k=sc.nextInt();
    
    if(x==1)
    {
        a[o-1]=k;
    }
    if(x==2)
    {
        if(o==k)
        {
            System.out.println(a[o-1]);
        }
       if(o>k)
       {
           int u=h[k-1];
           long op=a[k-1];
           for(int j=k-1;j<o-1;j++)
           {
          if(h[j]>u)
          {
            u=h[j];  
            op=op+a[j];
          }
           }
           if(h[o-1]>u)
          {
             op=op+a[o-1]; 
          }
           else{
               op=-1;
           }
           if(op>a[k-1])
         {
             System.out.println(op);   
         }
         else{
             System.out.println(-1);
         }
       }
       if(k>o){
           int u=h[k-1];
           long op=a[k-1];
           for(int j=k-1;j>=o;j--)
          {
          if(h[j]>u)
          {
            u=h[j];  
            op=op+a[j];
          }
          }
          if(h[o-1]>u)
          {
             op=op+a[o-1]; 
          }
          else{
              op=-1;
          }
         if(op>a[k-1])
         {
             System.out.println(op);   
         }
         
         else{
             System.out.println(-1);
         }
       }
    }
   }
}
    
}
