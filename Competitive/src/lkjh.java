
import java.util.ArrayList;
import java.util.Scanner;

public class lkjh {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
       
       ArrayList <Integer> l1=new  ArrayList<Integer>();
       int o=6;
       for(int l=1;l<=o;l++)
       {
       
       for(int i=1;i<=o;i++)
       {
           
           for(int j=1;j<=o;j++)
           {
               if(j>=i)
               for(int k=1;k<=o;k++)
               {
                   if(k>=i)
                   for(int d=1;d<=o;d++)
                   {
                       if(d>=k)
                     for(int p=1;p<=o;p++)
                     {
                         if(p>=d)
                         {
                      int s=i+j+k+l+p+d;
                      
                      if(l1.contains(s)!=true)
                      {
                          System.out.println(l+" "+i+" "+j+" "+k+" "+" "+d+" "+p);
                          l1.add(s);
                      }
                         }
                     }
                   }
               }
           }
       }
       }
       System.out.println(l1);
       System.out.println(l1.size());
   
}
    
}
