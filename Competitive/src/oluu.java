
import java.util.ArrayList;
import java.util.Scanner;

public class oluu {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int l=sc.nextInt();
       long ar[]=new long[n];
       long m=0;
       for(int i=0;i<n;i++)
       {
        ar[i]=sc.nextLong();
        if(ar[i]>m)
        {
            m=ar[i];
        }
       }
       String s=Integer.toBinaryString((int)m);
       int e=s.length();

       long p=(long)Math.pow(2,e); 
       
       long max=0;
       int u=0;
       int op=0;
       long ma=0;
       
       for(int i=1;i<=p;i++)
       {
            if(Integer.bitCount(i)<l)
         {
             long h=0;
          for(int j=0;j<n;j++)
          {
              h=h+(i&ar[j]);
              
          }
         if(h>ma)
         {
             op=1;
           ma=h;
         }
         else
         {
             if(h==ma)
             {
                 ++op;  
             }
         }
         }
         if(Integer.bitCount(i)==l)
         {
             long h=0;
          for(int j=0;j<n;j++)
          {
              h=h+(i&ar[j]);
              
          }
         if(h>max)
         {
           u=1;  
           max=h;
            
         }
         else{
             if(h==max)
             {
                 ++u;  
              }
         }
         }
       }
       if(max>ma)
           
       System.out.println(u);
       else{
          if(max<=ma)
          {
              System.out.println(-1);
          }
       }
   }
   
}
    
}
