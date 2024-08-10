
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class zxcvb {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       ArrayList <String> l1=new ArrayList<String>();
       for(int i=0;i<n;i++)
       {
           int y=sc.nextInt();
           String s=""+y;
           l1.add(s);
       }
       int k=sc.nextInt();
       ArrayList <String> l2=new ArrayList<String>();
       for(int i=0;i<k;i++)
       {
           int y=sc.nextInt();
        String s=""+y;
           l2.add(s);
       }
       
      if(n>=k)
      {
               Collections.sort(l2);
            int o=0;
          for(int i=0;i<k;i++)
          {
              String tl=l2.get(i);
              String p=""+(Integer.parseInt(tl)-1);
              String q=""+(Integer.parseInt(tl)+1);
               
              if(l1.contains(p))
                {
                    l1.remove(p);
                ++o;
                }
                else
                {
                  if(l1.contains(tl))
                  {
                      l1.remove(tl);
                  ++o;
                  }
                  else{  if(l1.contains(q))
                    {
                      l1.remove(q);
                    ++o;
                    }
                  }
                }
          }
          System.out.println(o);
      }
     else
      {
               Collections.sort(l1);
            int o=0;
          
      for(int i=0;i<n;i++)
          {
              String tl=l1.get(i);
              String p=""+(Integer.parseInt(tl)-1);
              String q=""+(Integer.parseInt(tl)+1);
               
              if(l2.contains(p))
                {
                    l2.remove(p);
                ++o;
                }
                else
                {
                  if(l2.contains(tl))
                  {
                      l2.remove(tl);
                  ++o;
                  }
                  else{  if(l2.contains(q))
                    {
                      l2.remove(q);
                    ++o;
                    }
                  }
                }
          }
             System.out.println(o);
      }   
       
}
    
}
