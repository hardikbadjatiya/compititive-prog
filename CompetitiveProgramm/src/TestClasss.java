/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;

class TestClasss {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        ArrayList <Integer> l1=new ArrayList <Integer>();
        ArrayList <Integer> l2=new ArrayList <Integer>();
        ArrayList <Integer> l3=new ArrayList <Integer>();
        ArrayList <Integer> l4=new ArrayList <Integer>();
       
        for(int j=0;j<t;j++)
       {
        int n=sc.nextInt();
        int l=sc.nextInt();
        int p=sc.nextInt();
        if(n==0)
        {
         l2.add(j);
                
         l3.add(0);
        }
        if(n==1)
        {
            int u=sc.nextInt();
            l2.add(j);
            
            l3.add(1);
            l4.add(u);
                
        }
            if(n==2)
            {

             int op=sc.nextInt();
            
             int k=sc.nextInt();
             int o=0;
             for(int i=0;i<op;i++)
             {
                 if(l3.get(i)==0)
                 {
                         l1.remove(l1.size()-1);
            
                 }     
                 if(l3.get(i)==1)
            {
                l1.add(l4.get(i));
            }
                         }   
                         for(int i=0;i<l1.size();i++)
                         {
                             if(l4.get(i)<k)
                             {
                                 o=o+1;
                         }
            }
              System.out.println(o);
           
        }
            
            
        }
    }
}
