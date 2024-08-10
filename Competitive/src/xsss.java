
import java.util.Scanner;
import java.util.TreeSet;

public class xsss {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   for(int p=1;p<=t;p++)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
   TreeSet<Integer> ts = new TreeSet<Integer>(); 
 
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           
       }
       int max=ar[0];
       int m=ar[0];
       int o=0;
       int l=0;
      if(n==1)
      {
         System.out.println("Case #"+p+": "+(o));
      }
      else{
       for(int i=1;i<n-1;i++)
       {
           ts.add(ar[i-1]);
           if(ar[i+1]<ar[i]&&ar[i]>ar[i-1])
           {
            if(ar[i]>ts.last())   
            ++o;
           }
       }
       ts.add(ar[n-2]);
           if(ar[n-1]>ar[n-2]&&ar[n-1]>ts.last())
           {
               l=1;
           }
        if(ar[0]>ar[1])
           {
               l++;
           }
       
           System.out.println("Case #"+p+": "+(o+l));
      }
   }
}
    
}
