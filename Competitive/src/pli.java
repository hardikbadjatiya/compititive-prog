
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import static oracle.net.aso.C03.k;

public class pli {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   long a[]=new long[t];
   long b[]=new long[t];
   long c[]=new long[t];
   double y[]=new double[t];
   for(int i=0;i<t;i++)
   {
       a[i]=sc.nextInt();
       b[i]=sc.nextInt();
       c[i]=sc.nextInt();
       y[i]=a[i]*a[i]+b[i]*b[i];
       y[i]=Math.sqrt(y[i])/c[i];
   }
   
   int x=0;
   
  HashMap<Double, Integer> elementCountMap = new HashMap<Double, Integer>();
       
           
        for (double o : y) 
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
         int u=0;
        for(Entry<Double, Integer> val : elementCountMap.entrySet()) 
        { 
            if (1 < val.getValue()) 
            { 
                 int p=val.getValue();
                u=u+(p*(p-1))/2;   
            } 
            
        } 
       
    System.out.println(u);
    
}
    
}
