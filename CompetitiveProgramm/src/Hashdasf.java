
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Hashdasf {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
      
   int ar[]=new int[a];
        HashMap<String, Integer> elementCountMap = new HashMap<String, Integer>();
           
           for(int j=0;j<a;j++)
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
           
        System.out.println(elementCountMap);
       for(Map.Entry<Integer, Integer> val : elementCountMap.entrySet()) 
         {  
//            if (max_count < val.getValue()) 
//            { 
//                res = val.getKey(); 
//                max_count = val.getValue(); 
//            }
             System.out.print(val.getValue()+val.getKey()+" ");
         }
         
}    
}
