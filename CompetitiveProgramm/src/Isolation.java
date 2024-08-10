
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Isolation {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   while(a-->0)
   {
       int n=sc.nextInt();
       int q=sc.nextInt();
       String st=sc.next();
       char ar[]=new char[n];
       ar = st.toCharArray(); 
       HashMap<Character, Integer> elementCountMap = new HashMap<Character, Integer>();
           for (char o : ar) 
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
     
       for(int i=0;i<q;i++)
       {
           int max_count=sc.nextInt();
         if(max_count==1)
         {
            long s=st.chars().distinct().count();
             System.out.println(n-s);
         }
         else{
           int sum=0;
         for(Entry<Character, Integer> val : elementCountMap.entrySet()) 
        { 
            if (max_count < val.getValue()) 
            { 
                sum =sum+ val.getValue()-max_count; 
            } 
        }
           System.out.println(sum);
       }
       }
   }
}
    
}
