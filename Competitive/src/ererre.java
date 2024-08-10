
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class ererre {
       static long printNcR(int n, int r) { 
  
        long p = 1, k = 1; 
  
        if (n - r < r) { 
            r = n - r; 
        } 
  
        if (r != 0) { 
            while (r > 0) { 
                p *= n; 
                k *= r; 
               long m = __gcd(p, k); 
  
                p /= m; 
                k /= m; 
  
                n--; 
                r--; 
            } 
  
        } else { 
            p = 1; 
        } 
  return p;
    } 
  
    static long __gcd(long n1, long n2) { 
        long gcd = 1; 
  
        for (int i = 1; i <= n1 && i <= n2; ++i) { 
            if (n1 % i == 0 && n2 % i == 0) { 
                gcd = i; 
            } 
        } 
        return gcd; 
    }
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int a[]=new int[n];

     TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(); 
     TreeSet<Integer> ts = new TreeSet<Integer>(); 
   
   for(int i=0;i<n;i++)
   {
   a[i]=sc.nextInt();
   ts.add(a[i]);
   
           if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i])+1);
            }
        else
            {
                map.put(a[i], 1);
            }
   }
   long l=0;
    for(int  f:ts)
       {
         int y=0;
         int z=0;
          z=map.get(f);
          if(z==3)
          {
              ++l;
          }
          if(z>3)
          {
         for(int k=z;k>=3;k--)
         {
       l=l+printNcR(z, k);
          }
          }
       }
           System.out.println(l);
         
 
}
    
}
