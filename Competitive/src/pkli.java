
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class pkli {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
      String  st=sc.next();
      char ar[]=st.toCharArray();
      TreeSet <Character> ts=new TreeSet<>();
    TreeMap <Character , Integer> map =new TreeMap<Character, Integer>();
      String ty="";
      for(int i=n-1;i>=0;i--)
      {
         ts.add(ar[i]);
         if(map.containsKey(ar[i]))
         {
             map.put(ar[i], map.get(ar[i])+1);
             
         }
         else{
             map.put(ar[i],1);
         }
      }
      String h="";
      for(char e:ts)
      {
       h=h+e;   
      }
      StringBuilder sb=new StringBuilder(h);
       System.out.println(sb.reverse());
   }
}
    
}
