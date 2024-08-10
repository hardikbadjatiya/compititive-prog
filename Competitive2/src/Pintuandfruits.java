
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pintuandfruits {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int k=sc.nextInt();
   ArrayList <Integer> l2=new ArrayList<Integer>();
         
   for(int l=0;l<k;l++)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int p[]=new int[n];
       int f[]=new int[n];
       for(int i=0;i<n;i++)
       {
           f[i]=sc.nextInt();
           
       }
       for(int i=0;i<n;i++)
       {
           p[i]=sc.nextInt();
           
       }
       for(int j=0;j<n-1;j++)
           {
       for(int i=0;i<n-1;i++)
       {
               int te=0;
               int y=0;
               if(f[i]>f[i+1])
               {
                   te=f[i];
                   f[i]=f[i+1];
                   f[i+1]=te;
                   y=p[i];
                   p[i]=p[i+1];
                   p[i+1]=y;
                   
               }
           }
       }
         ArrayList <Integer> l1=new ArrayList<Integer>();
         int x=p[0];       
         for(int i=0;i<n-1;i++)
                {
                    if(f[i]==f[i+1])
                    {
                   x=x+p[i+1]; 
                    if(i==n-2)
                    {
                        l1.add(x);
                    }
                    }
                    else if(f[i]!=f[i+1])
                    {
                        l1.add(x);
                        x=p[i+1];
                    }
                    
                }
      java.util.Collections.sort(l1);
   int fg=l1.get(0);
   l2.add(fg);
   }
  for(int lp=0;lp<l2.size();lp++)
  {
      System.out.println(l2.get(lp));
  }
  sc.close();
  System.exit(0);
}
    
}
