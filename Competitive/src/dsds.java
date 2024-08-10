
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class dsds {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       long k=sc.nextLong();
       long ar[]=new long[n];
       long x=0;
       for(int i=0;i<n;i++)
       {
       ar[i]=sc.nextLong();
       if(ar[i]%k!=0)
       {
       ar[i]=k-(ar[i]%k);
       }
       else{
         ar[i]=0;  
       }
       }
       
       long h=0;
        HashMap<Long, Integer> elementCountMap = new HashMap<Long, Integer>();
          
           
           for (long o : ar) 
        {
            
            if(elementCountMap.containsKey(o))
            {
                elementCountMap.put(o, elementCountMap.get(o)+1);
            }
            else
            {
                elementCountMap.put(o, 1);
            }
        }
            int max_count = 0;
            long res = -1;
            int y=elementCountMap.size();
     int u=0;
     long max=0;
     long r=0;
       long o=0; 
        for(Entry<Long, Integer> val : elementCountMap.entrySet()) 
        { 
           if(val.getValue()>max&&val.getKey()>0)
           {
               
             max=val.getValue();
             r=val.getKey();
           }
           if(val.getValue()==max&&val.getKey()>r)
           {
          
             r=val.getKey();
           }
           
           
//           if(val.getKey()>1)
//           { 
//            a[u]=(val.getKey()+1)*val.getValue();
//            u++;
//           }
//           else if(val.getKey()==1)
//           {
//               a[u]=((val.getValue()-1)*k)+2;
//           u++;
//           }
         } 
            if(max==0&&r==0)
            {
                System.out.println(0);
            
            }
            else
            {
                long hl=(max-1)*k+1+r;
                System.out.println(hl); 
            
            }
       
   }
}
    
}
