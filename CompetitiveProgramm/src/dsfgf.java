
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dsfgf {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    for(int k=0;k<t;k++)
    {
        int n=sc.nextInt();
        int ar[]=new  int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        } 
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
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
                   int x=elementCountMap.size();
                   
            int max_count = 0, res = -1; 
     
        for(Map.Entry<Integer, Integer> val : elementCountMap.entrySet()) 
        { 
            if (max_count < val.getValue()) 
            { 
                res = val.getKey(); 
                max_count = val.getValue(); 
            } 
        } 
        if(max_count>x)
        {
            System.out.println(x);
        }
        if(max_count==x)
        {
            System.out.println(x-1);
        }
        else if (max_count<x){
            System.out.println(max_count);
        }
      
        }
    
}    
}
