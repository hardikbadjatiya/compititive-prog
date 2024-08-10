
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import static oracle.net.aso.C03.y;

public class sdsddsds {
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
       HashMap<Long, Integer> elementCountMap = new HashMap<Long, Integer>();
       HashMap<Long, Integer> element = new HashMap<Long, Integer>();
       
           
        for (long o : a) 
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
         String s="";
        for(Entry<Long, Integer> val : elementCountMap.entrySet()) 
        { 
            if ( val.getValue()%2==1) 
            { 
               s=s+val.getKey()+" ";
            break;       
            } 
            
        } 
 for (long o : b) 
        {
            if(element.containsKey(o))
            {
                element.put(o, element.get(o)+1);
            }
            else
            {
                element.put(o, 1);
            }
        }
        for(Entry<Long, Integer> val : element.entrySet()) 
        { 
            if ( val.getValue()%2==1) 
            { 
               s=s+val.getKey()+" ";
            break;       
            } 
            
        }       
       System.out.println(s);
       
   }
}
    
}
