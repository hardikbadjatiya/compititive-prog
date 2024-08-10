
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SDFGHJSDFGHJ {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String st=sc.next();
   int n=st.length();
   char ch[]=new char[n];
   for(int i=0;i<n;i++)
   {
       ch[i]=st.charAt(i);
   }
       HashMap<Character, Integer> elementCountMap = new HashMap<Character, Integer>();
      
       for(int i=0;i<n;i++)
       {
          char p=st.charAt(i);
            if(elementCountMap.containsKey(p))
            {
                elementCountMap.put(p, elementCountMap.get(p)+1);
            }
            
          else
            {
                elementCountMap.put(p, 1);
            }
       }
            int max_count = 0, res = -1; 
     
        for(Map.Entry<Character, Integer> val : elementCountMap.entrySet()) 
        { 
                res = val.getKey();
                char u=(char)res;
                max_count = val.getValue(); 
            
            System.out.println(u+" "+max_count); 
            
        } 
    
   
}
    
}
