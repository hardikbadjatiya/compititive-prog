
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sadasdsd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
    int n=sc.nextInt();
    
    ArrayList <Integer> l1=new ArrayList<Integer>();
            
          int ar[]=new int[n];
           for(int j=0;j<n;j++)
            {
                ar[j]=sc.nextInt();
                if(l1.contains(ar[j])!=true)
                {
                    l1.add(ar[j]);
                }
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
                int max_count = 0, res = -1; 
     
                int arr[]=new int[elementCountMap.size()];
        int i=0;
                for(Map.Entry<Integer, Integer> val : elementCountMap.entrySet()) 
        { 
            arr[i]=val.getValue();
            i++;
        } 
                int y=0;
       Arrays.sort(arr);
       int l=elementCountMap.size();
       for(int j=1;j<l;j++)
       {
        if(arr[j]<=arr[j-1])
        {
            System.out.println("sdff");
            y=1;
            break;
        }
       }
       if(y==0)
       {
           int o=0;
           int p=0;
           for(int k=0;k<n;k++)
           {
           if(l1.get(o)==ar[k])
           {
               ++p;
               if(arr[o]==p)
               {
               p=0;
               ++o;
               }
           }
           else{
               if(arr[o]!=p)
               {
                   y=1;
                   break;
               }
               p=0;   
               o++;
           }
           }
           
       }
       if(y==0)
       {
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
       
   }
}
    
}
