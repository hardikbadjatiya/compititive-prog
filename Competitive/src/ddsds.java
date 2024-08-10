
import java.util.ArrayList;
import java.util.Scanner;

public class ddsds {
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
       ArrayList <Long> l1=new ArrayList<Long>();
       ArrayList <Long> l2=new ArrayList<Long>();
       
       for(int i=0;i<x-1;i++)
       {
           for(int j=i+1;j<x;j++)
           {
              long k=(a[i]+a[j])/2;
              long l=(b[i]+b[j])/2;
              if(l1.contains(k)!=true&&l2.contains(l)!=true)
              {
                  l1.add(k);
                  l2.add(l);
              }
              else if(l1.contains(k)&&l2.contains(l)){
                  l1.remove(k);
                  l2.remove(l);
              }
           }
       }
       System.out.println(l1);
       System.out.println(l2);
   }
}
    
}
