
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class LeakedAns {
   
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int p=0;p<t;p++)
   {
         int n=sc.nextInt();
         int m=sc.nextInt();
         int k=sc.nextInt();
       String s="";
         for(int i=0;i<n;i++)
        {
            int ar[]=new int[k];
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
       
           for(int j=0;j<k;j++)
            {
                ar[j]=sc.nextInt();
            }
           for (int o : ar) 
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
            int max_count = 0, res = -1; 
     
        for(Entry<Integer, Integer> val : elementCountMap.entrySet()) 
        { 
            if (max_count < val.getValue()) 
            { 
                res = val.getKey(); 
                max_count = val.getValue(); 
            } 
            
        } 
        s=s+res+" ";
        }
        System.out.println(s);
   }
}
}
