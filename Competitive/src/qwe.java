
import java.util.Arrays;
import java.util.Scanner;

public class qwe {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int e=sc.nextInt();
   String s=sc.next();
   int ar[]=new int[n];
   int a[]=new int[n];
   int b[]=new int[n];
  
   String st[]=new String[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
        st[i]=sc.next();
     
   }
   
   if(s.contains("G"))
   {
               int yh=0;
       for(int i=1;i<e;i++)  
   {
     if(s.charAt(i)=='G')
         ++yh;
     
   }
      for(int i=0;i<n;i++)
      {
        String r=st[i];
        int x=ar[i];
      int o=0;
        for(int j=0;j<x;j++)
        {
        if(r.charAt(j)=='C')
            ++o;
            
        }
        if(o>0)
        {
           b[i]=Math.max(o, yh);
        }
      }
   }
   if(s.contains("C"))
   {
      
                int yh=0;
       for(int i=1;i<e;i++)  
   {
     if(s.charAt(i)=='C')
         ++yh;
     
   }
      for(int i=0;i<n;i++)
      {
        String r=st[i];
        int x=ar[i];
      int o=0;
        for(int j=0;j<x;j++)
        {
        if(r.charAt(j)=='G')
            ++o;
             
        }
        if(o>0)
        {
           a[i]=Math.max(o, yh);
        }
      }
   }
 int max=-1;
 int y=-1;
   for(int i=0;i<n;i++)
 {
    a[i]=a[i]+b[i];
    if(a[i]>max)
    {
        max=a[i];
        y=i+1;
    }
 }
   
    System.out.println(y);
  
     
   
}
    
}
