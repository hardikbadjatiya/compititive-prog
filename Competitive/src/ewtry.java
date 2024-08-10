
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class ewtry{
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   
  int n=sc.nextInt();
  int a[]=new int[n];
     TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(); 
     TreeSet<Integer> ts = new TreeSet<Integer>(); 
     TreeSet<Integer> tsf = new TreeSet<Integer>(); 
     TreeSet<Integer> tsff = new TreeSet<Integer>(); 
     TreeSet<Integer> tsfff = new TreeSet<Integer>(); 
     TreeSet<Integer> tsffff = new TreeSet<Integer>(); 
     
for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
           ts.add(a[i]);
           if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i])+1);
                             int f=a[i];
            }
        else
            {
                map.put(a[i], 1);
            }
       }
       for(int f:ts)
       {
                                            if(map.get(f)>=2&&map.get(f)<4)
                {
                  
                   tsfff.add(f);
                }
           if(map.get(f)>=8)
                {
                  tsff.add(f);
                }
           if(map.get(f)>= 4&&map.get(f)<6 )
                {
                   tsf.add(f);
                }
           if(map.get(f)>=6&&map.get(f)<8)
                {
                   tsffff.add(f);
                } 
      
       }
int k=sc.nextInt();
   for(int i=0;i<k;i++)
    {
        int o=0;
        
          char b=sc.next().charAt(0);
        int f=sc.nextInt();
          ts.add(f);
       if(b=='+')
      {
          if(map.containsKey(f))
          {
              map.put(f, map.get(f)+1);
              if(map.get(f)>=2&&map.get(f)<4)
                {
                   tsfff.add(f);
                }
           if(map.get(f)>=8&&tsffff.contains(f))
                {
                   tsffff.remove(f);
                  tsff.add(f);
                }
           if(map.get(f)>= 4&&map.get(f)<6          &&tsfff.contains(f))
                {
                   tsfff.remove(f);
                   tsf.add(f);
                }
           if(map.get(f)>=6&&map.get(f)<8  &&tsf.contains(f))
                {
                   tsf.remove(f);
                   tsffff.add(f);
                } 
          }
          else{
              map.put(f, 1);
          ts.add(f);
           }
      }
      if(b=='-')
      {
          map.put(f, Math.max(map.get(f)-1, 0));
           if(map.get(f)<4&&tsf.contains(f))
                {
                   tsf.remove(f);
                   tsfff.add(f);
                }
           if(map.get(f)<8&&tsff.contains(f))
                {
                   tsff.remove(f);
                   tsffff.add(f);
                   
                }
           if(map.get(f)<6  &&tsffff.contains(f))
                {
                   tsffff.remove(f);
                   tsf.add(f);
                }
           if(map.get(f)<2  &&tsfff.contains(f))
                {
                   tsfff.remove(f);
                   
                }
          }
      int u=0;
      int p=0;
   if(tsf.size()>1||tsff.size()>0)
      {
       o=1;
      }
   if(tsffff.size()>=1&&tsfff.size()>=1)
   {
       o=1;
   } 
   if(tsf.size()>=1      &&tsfff.size()>1)
   {
       o=1;
   }
   if(tsffff.size()>=1&&tsfff.size()>=1)
   {
       o=1;
     
   }
   if(tsffff.size()>=1&&tsf.size()>=1)
   {
       o=1;
   
   }  
   
   else if(o==0){
          if(tsf.size()>0)
      {
      for(int ab:ts)
      {
          if(map.get(ab)>=2)
          {
              if(map.get(ab)>=4)
              {
              
                if(map.get(ab)>=6)
               {
                  if(map.get(ab)>=8)
                 {
                    u=u+4;
                 }
                else{
                    u=u+3;
                }
              }
              else{
                  u=u+2;
                  }
                }
              else{
                  u++;
              }
          }
          if(u>=4)
          {
              if(tsf.size()>0)
              {
              o=1;
              break;
          }
          }
      }
      }
      }
      if(o==1)
    {
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
    }
    
   }

    
}
