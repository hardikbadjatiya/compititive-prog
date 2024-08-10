
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class djfkgfgf {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
     int n=sc.nextInt();
        int ar[]=new int[n];
        ArrayList <Integer>l1= new ArrayList<Integer>();
        int x=1;
         ar[0]=sc.nextInt();
       
        for(int i=1;i<n;i++)
        {
         ar[i]=sc.nextInt();
         
        if(ar[i]==ar[i-1])
        {
            x++;
            if(i==n-1)
            {
                l1.add(x);
            
            }
        }
        else{
            l1.add(x);
        x=1;
        }
        }
       
      java.util.Collections.sort(l1);
           int k=l1.size();
     
//        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
//       
//           for (int o : ar) 
//        {
//            if(elementCountMap.containsKey(o))
//            {
//                elementCountMap.put(o, elementCountMap.get(o)+1);
//            }
//            else
//            {
//                elementCountMap.put(o, 1);
//            }
//            
//        }
//           
//           int k=elementCountMap.size();
//             int max_count = 0, res = -1; 
//             int arr[]=new int[k];
//             int x=0;
//        for(Map.Entry<Integer, Integer> val : elementCountMap.entrySet()) 
//        { 
//                
//                arr[x]= val.getValue();
//                x++;
//        } 
//        Arrays.sort(arr);
 if(k==2) 
          {
        System.out.println(l1.get(k-1)+l1.get(k-2));
          }
          if(k>2)
          {
        System.out.println(l1.get(k-1)+l1.get(k-2)+l1.get(k-3));
          } 
          if(k==1)
          {
              System.out.println(l1.get(k-1));
          }

}
    
}
