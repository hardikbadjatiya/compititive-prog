
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class JunrEsay {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
   int a[]=new int[m];
   int b[]=new int[m];
   ArrayList <Integer > l1=new ArrayList<Integer>();
   ArrayList <Integer > l2=new ArrayList<Integer>();
    String st="";
   
   for(int i=0;i<m;i++)
   {
       a[i]=sc.nextInt();
       b[i]=sc.nextInt();
       l1.add(a[i]);
       l2.add(b[i]);
          st=st+"* "+a[i]+" "+b[i]+" ";
        
   }
   
           for(int i=0;i<l2.size();i++)
           {
           for(int j=0;j<l1.size();j++)
           {
               if(l1.get(i)==l2.get(j))
               {
                   String s=" "+l2.get(i)+" "+l1.get(j)+" ";
                   String e=" "+l1.get(j)+" "+l2.get(i)+" ";
              if(st.contains(s)!=true&&st.contains(e)!=true)
               {
                   l1.add(l2.get(i));
                   l2.add(l1.get(j));
                   l2.add(l2.get(i));
                   l1.add(l1.get(j));
                   st=st+" * "+s;
               }
               }
               
           }
           }
           for(int i=0;i<l2.size();i++)
               {
           for(int j=0;j<l1.size();j++)
               {
               if(l1.get(i)==l1.get(j)&&i!=j)
               {
                 String s= " "+l2.get(i)+" "+l2.get(j)+" ";
                 String e= " "+l2.get(j)+" "+l2.get(i)+" ";
                 if(st.contains(s)!=true&&st.contains(e)!=true)
                 {
                   l1.add(l2.get(i));
                   l2.add(l2.get(j));
                  l1.add(l2.get(j));
                   l2.add(l2.get(i));
                  
                   st=st+" * "+a;
                  
                 }
               }
               
               if(l2.get(i)==l2.get(j)&&i!=j)
               {
                    String s= " "+l1.get(i)+" "+l1.get(j)+" ";
                     String e=" "+l1.get(j)+" "+l1.get(i)+" ";
                  if(st.contains(s)!=true&&st.contains(e)!=true)
                  {
                   l1.add(l1.get(i));
                   l2.add(l1.get(j));
                   l2.add(l1.get(i));
                   l1.add(l1.get(j));
    
                   st=st+ " * "+s;
                  }
               }
               }
               }
             HashSet <Integer>s=new HashSet<Integer>();
             for(int i=0;i<l2.size();i++)
             {
                 s.add(l2.get(i));
                 s.add(l1.get(i));
                 
             }
             System.out.println(s.size());
           
}
        
}
