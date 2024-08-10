
import java.util.ArrayList;
import java.util.Scanner;

public class sde {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   String st=sc.next();
   ArrayList <String> l1=new ArrayList<String>();
   ArrayList <Integer> l2=new ArrayList<Integer>();
   
   String s="";
   for(int i=0;i<n;i++)
   {
       String h=""+st.charAt(i);
    if(s.contains(h)!=true)
    {
        s=s+h;
        if(i==n-1)
        {
            l1.add(s);
            l2.add(i+1);
        }
    }
    else{
        l1.add(s);
        s="";
        l2.add(i);
        
    }
    
   }
  if(l2.size()==k) 
  {
     for(int i=0;i<k;i++)
     {
         System.out.println(l2.get(i)) ;
     }
    
  }
  if(l2.size()>k)
  {
     for(int i=0;i<k-1;i++)
     {
         System.out.println(l2.get(i)) ;
     }
      System.out.println(l2.get(l2.size()-1));
     
  }
  if(l2.size()<k)
  {
   int e=k-l2.size();
   for(int i=0;i<l2.size();i++)
   {
      for(int j=0;j<l2.get(i);j++)
      {
         if(l2.contains(j+1)!=true) 
         {
             l2.add(j+1);
             e--;
             if(e==0)
                 break;
         }
      }
      if(e==0)
          break;
   }
   java.util.Collections.sort(l2);
   for(int i=0;i<l2.size();i++)
   {
       System.out.println(l2.get(i));
   }
   
  }
  String h="";
  for(int i=k;i>=1;i--)
  {
      h=h+i+" ";
  }
    System.out.println(h);
}
    
}
