
import java.util.ArrayList;
import java.util.Scanner;

public class dsfsdfsdf {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int  t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       long ar[]=new long[n*n];
       long y=0;
       ArrayList <Long> l1=new  ArrayList<Long>();
          
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextLong();
           
       }
       int k=n;
       int u=0;
       while(k-->0)
       {
         long max=0;
         int r=-1;
         for(int i=0;i<n;i++)
         {
         if(ar[i]>max&&l1.contains(ar[i])!=true)
         {
             max=ar[i];
             r=i;
             
         }
         }
          l1.add(max);
         y=y+max;
         ar[r]=0;
           System.out.println(l1);
         u=r;
       }
       for(int i=u-1;i>=0;i--)
       {
           if(ar[i]<l1.get(l1.size()-1))
           {
               l1.add(ar[i]);
               y=y+ar[i];
           }
       }
       
       
       System.out.println(y);
   }
}
    
}
