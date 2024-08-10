
import java.util.Arrays;
import java.util.Scanner;

public class ewerer {
public static void main(String[] args) {
   
	    Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int l=sc.nextInt();
       long ar[]=new long[n];
       long a[]=new long[40];
      
       for(int i=0;i<n;i++)
       {
           
        ar[i]=sc.nextLong();
        long x=ar[i];
        int t1=0;
        while(x!=0)
            {
                a[t1]+=(x%2);
                t1+=1;
                x=x/2;
            }
       }
           
        
         long x=2;
         for(int i=1;i<40;i++)
        {   
            a[i]=a[i]*x;
            x=x*2;
        }
        long m=-1;
        int mi=-1;
        long ans=0;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<40;j++)
            {
                if(a[j]>Math.max(0,m))
                {
                    m=a[j];
                    mi=j;
                }
            }
            a[mi]=-1;
            if(mi>-1)
            {
                ans+=(Math.pow(2,mi));
            }
            m=-1;
            mi=-1;
        }

       System.out.println(ans);
   }
}
    
}
