
import java.util.*;

public class eqr {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int k=sc.nextInt();
   while(k-->0)
   {
       int n=sc.nextInt();
       long ar[]=new long[n];
       long b[]=new long[n];
       
        long min=1000000000;
     
        for(int i=0;i<n;i++)
       {
       ar[i]=sc.nextLong();
       if(min>ar[i])
       {
           min=ar[i];
       }
       }
        long min2=1000000000;
       for(int i=0;i<n;i++)
       {
       b[i]=sc.nextLong();
       if(min2>b[i])
       {
           min2=b[i];
       }
       }
        
       long y=0;
       for(int i=0;i<n;i++)
       {
           y=y+Math.max(ar[i]-min, b[i]-min2);
       }
       System.out.println(y);
       
   }
}
    
}
