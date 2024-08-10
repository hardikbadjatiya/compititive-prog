
import java.util.Scanner;

public class msds {
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
            
         if(Integer.bitCount(i)==l)
         {
             long h=0;
          for(int j=0;j<n;j++)
          {
              h=h+(i&ar[j]);
              
          }
         if(h>max)
         {
           u=i;  
           max=h;
         }
         
         }
       }
       System.out.println(u);
       
   }
   
}
    
}
