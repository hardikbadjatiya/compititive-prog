
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class fefeff {
public static void main(String[] args) {
  
    	// your code goes here
 Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
 
    
    while(t-->0)
  {
      int n=sc.nextInt();
      long x=sc.nextInt();
      long ar[]=new long[n];
           ArrayList <Long> l1=new ArrayList<Long>();
           ArrayList <Long> l2=new ArrayList<Long>();
     
           for(int i=0;i<n;i++)
            {
          ar[i]=sc.nextLong();
          if(ar[i]>=x)
          {
            l1.add(ar[i]);
          }
          else{
              l2.add(ar[i]);
          }
        }
           int xy=0;
     Collections.sort(l2);
   if(l2.size()>0)
   {
     xy=l2.size();
    long kp=l2.get(xy-1);
    if(kp*2>=x)
    {
      l1.add(kp);
    xy=xy-1;
   
    }
   } 
   Collections.sort(l1);
    long p=0;
      long o=0;
     int y=1;    
      for(long f:l1)
       {
     while(true)
     {
     if(f>x)
     {
        p++;
        x=2*x;
     }
     else
     {
    p++;
         x=2*f;
     break;
     }
    
     }
       } 
      
      System.out.println(p+xy);
  }

}
    
}
