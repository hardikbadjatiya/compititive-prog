
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class peroepr {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in)
    ;
   int t=sc.nextInt();
   while(t-->0)
   {
       String st=sc.next();
       String h=sc.next();
       String o=""+st;
       String p=""+h;
       TreeMap <Character , Integer  >ts =new TreeMap<>();
       int n=st.length();
       for(int i=0;i<n;i++)
       {
          if(ts.containsKey(st.charAt(i)))
          {
              ts.put(st.charAt(i), ts.get(st.charAt(i))+1);
          }
          else{
              ts.put(st.charAt(i), 1);
          }
       }
       
       int u=h.length();
       TreeMap <Character, Integer >tss=new TreeMap<>();
       for(int i=0;i<u;i++)
       {
          if(tss.containsKey(h.charAt(i)))
          {
              tss.put(h.charAt(i), tss.get(h.charAt(i))+1);
          }
          else{
              tss.put(h.charAt(i), 1);
          }
       }
       for(Entry<Character, Integer> val : tss.entrySet()) 
        { 
            
           ts.put(val.getKey(), ts.get(val.getKey())-val.getValue());
            
        }
       char f=h.charAt(0);
       String k="";
       int x=0;
        
       for(Entry<Character, Integer> val : ts.entrySet()) 
        { 
           char r=val.getKey();
           int op=val.getValue();
           if(r<f)
           {
              for(int i=0;i<op;i++)
              {
                  k=k+r;
              }
              
           }
           if(r==f)
              {
              for(int i=0;i<op;i++)
              {
                  k=k+r;
              }
              x=1;
              k=k+h;
              }
           if(r>f)
           {
               if(x==0)
               {
                   k=k+h;
                   x++;
               }
               for(int i=0;i<op;i++)
              {
                  k=k+r;
              }
           }
        }
         if(x==0)
         {
            k=k+h; 
         }
       System.out.println(k);
       
   }
}
    
}
