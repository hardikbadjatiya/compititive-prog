
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dfsd {
     static long fact(long n)
   {
       long output;
       if(n==1){
         return 1;
       }
       //Recursion: Function calling itself!!
       output = fact(n-1)* n;
       return output;
   }
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       long ar[]=new long[n];
       long x=0;
        ArrayList <Long>l1=new ArrayList<Long>();
        ArrayList <Long>l2=new ArrayList<Long>();
          
       for(int i=0;i<n;i++)
       {
       ar[i]=sc.nextLong();
       if(ar[i]%2!=0)
       {
       l1.add(ar[i]);
       }
       else
       {
        l2.add(ar[i]);
       }
       }
       
       long h=0;
        HashMap<Long, Integer> elementCountMap = new HashMap<Long, Integer>();
          
           l1.forEach((o) -> {
               if(elementCountMap.containsKey(o))
               {
                   elementCountMap.put(o, elementCountMap.get(o)+1);
               }
               else
               {
                   elementCountMap.put(o, 1);
               }
       });
            HashMap<Long, Integer> element = new HashMap<Long, Integer>();
             
           l2.forEach((o) -> {
               if(element.containsKey(o))
               {
                   element.put(o, element.get(o)+1);
               }
               else
               {
                   element.put(o, 1);
               }
       });
                                     
            int g=element.size();
            int y=elementCountMap.size();
    
     long max=1;
     long k=1;
        for(Map.Entry<Long, Integer> val : elementCountMap.entrySet()) 
        { 
           if(val.getValue()>1)
           {
             max=max*fact(val.getValue());
           
           }
          
        }
        for(Map.Entry<Long, Integer> val : element.entrySet()) 
        { 
           if(val.getValue()>1)
           {
             k=k*fact(val.getValue());
           }
        }
        long a=(g*(g-1))/2;
        long b=a*(y*(y-1))/2;
       long u=1;
       if(g>1)
        {
            u=u+a/max;
        }
        if(y>1)
        {
            u=u+b/k;
        }
        System.out.println(u-1);
        
   }
}
    
}
