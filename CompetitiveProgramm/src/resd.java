
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class resd {
public static void main(String[] args) {
   Scanner sc=new  Scanner(System.in);
   int n=sc.nextInt();
   String ar[]=new String[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.next();
       
   }
   HashMap<String, Integer> elementCountMap = new HashMap<String, Integer>();
           for (String o : ar) 
        {
            
            if(elementCountMap.containsKey(o))
            {
                System.out.println(o+""+elementCountMap.get(o));
                elementCountMap.put(o, elementCountMap.get(o)+1);
            
            }
            else
            {
                elementCountMap.put(o, 1);
                System.out.println("OK");
            }
        }
       
}
    
}
