
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class sdsddssdds {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       long a[]=new long[n];
       long b[]=new long[n];
       TreeMap<Long, Integer> map = new TreeMap<Long, Integer>(); 
       TreeMap<Long, Integer> mapp = new TreeMap<Long, Integer>(); 
   TreeSet<Long> ts = new TreeSet<Long>(); 
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
       for(int i=0;i<n;i++)
       {
           b[i]=sc.nextInt();
           ts.add(b[i]);
           if(mapp.containsKey(b[i]))
            {
                mapp.put(b[i], mapp.get(b[i])+1);
            }
            else
            {
                mapp.put(b[i], 1);
            }
       }
       
       int u=0;
       int ys=0;
       long mi1=ts.first();
       ArrayList <Long> l1=new ArrayList<Long>();
       ArrayList <Long> l2=new ArrayList<Long>();
       for(long f:ts)
       {
         int y=0;
         int z=0;
         if(mapp.containsKey(f))
         {
             y=mapp.get(f);
         }
         if(map.containsKey(f))
         {
             z=map.get(f);
         }
         if((y+z)%2!=0)
         {
             u=1;
             break;
         }
         else{
             
          if(y>z)
          {
            for(int i=0;i<(y-z)/2;i++)
            {
             l1.add(f);
            }
          }
          
          if(z>y)
          {
            for(int i=0;i<(z-y)/2;i++)
            {
             l2.add(f);
            }  
          }
          if(mi1==f)
          {
              ys=Math.abs(z-y)/2;
          }
         }
       }
       if(u==1)
       {
           System.out.println("-1");
       }
       else{
             
              
           long o=0;
           int p=l1.size();
//           o=((p-2*ys)*mi1)+(ys*mi1);
           for(int i=0;i<p;i++)
           {
               o=o+Math.min(2*mi1,Math.min(l1.get(i), l2.get(p-i-1)));
           }
           System.out.println(o);
       }
  
   }
   
   
   
}
    
}
