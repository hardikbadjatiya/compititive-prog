
import java.util.ArrayList;
import java.util.Scanner;

public class ssdsdsd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int x=4*n-1;
       long a[]=new long[x];
       long b[]=new long[x];
       for(int i=0;i<x;i++)
       {
           a[i]=sc.nextLong();
           b[i]=sc.nextLong();
       }
       int p[]=new int[x];
       for(int i=0;i<x;i++)
       {
           
           long ia=a[i];
           long ib=b[i];
           for(int j=0;j<x;j++)
           {
           if(j!=i) 
           {
           long ja=a[j];
           long jb=b[j];
          
           for(int k=0;k<x;k++)
           {
               if(k!=j&&k!=i)
               {
                   long ka=a[k];
                   long kb=b[k];
                   for(int l=0;l<x;l++)
                   {
                       if(l!=k&&l!=j&&l!=i)
                           
                   }
               }
           }
           
           }
           
           }
       }
       ArrayList <Long> l1=new ArrayList<Long>();
       ArrayList <Long> l2=new ArrayList<Long>();
       
   }
}
    
}
