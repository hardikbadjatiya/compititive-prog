
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class Cod5 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
      int n=sc.nextInt();
      int ar[]=new int[n];
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
     int s=0;
    int w=0;
     int y=elementCountMap.size();
        int arr[] =new int[10000];
        int arre[] =new int[y];
        int x=0;
      Map<Integer, Integer> map = new TreeMap<Integer, Integer>(elementCountMap); 
         Set set2 = map.entrySet();
         Iterator iterator2 = set2.iterator();
         while(iterator2.hasNext()) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
//              System.out.print(me2.getKey() + ": ");
//              System.out.println(me2.getValue());
              int r=(int) me2.getValue();
              int o=(int) me2.getKey();
              
              s=s+(r+w)/o;
                w=(r+w)%o;
         }
//        for(Map.Entry<Integer, Integer> val : elementCountMap.entrySet()) 
//        {
//            arre[x]=val.getKey();
//            
//            arr[arre[x]]=val.getValue();
//            x++;
//        
//        }
//         if(n>1)
//        {
//        Arrays.sort(arre);
//    
//        }for(int i=0;i<y;i++)
//    {
//       s=s+(arr[arre[i]]+w)/arre[i];
//       w=(arr[arre[i]]+w)%arre[i];
//    } 
     
        System.out.println(s);
}
}    
}
