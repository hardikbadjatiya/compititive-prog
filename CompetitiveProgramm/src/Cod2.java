
import java.util.ArrayList;
import java.util.Scanner;

public class Cod2 {
    static int calc(ArrayList<Long> l1)
    {
       int x=0;
       for(int i=0;i<l1.size()-1;i++)
       {
       for(int k=i;k<l1.size()-1;k++)
       {
        ArrayList <Long> l2=new ArrayList<Long>();
       l2.add(l1.get(0));
      for(int j=k;j<l1.size();j++)
           {
               if(l1.get(j)>l2.get(l2.size()-1)&&l1.get(j)%l2.get(l2.size()-1)==0)
               {
                   l2.add(l1.get(j));
               }
           }
       int s=l2.size();
           if(s>x)
           {
               x=s;
           }
       
       }
           
       }
        return x;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       long ar[]=new long[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           
       }
       int max=0;
       for(int i=0;i<n-1;i++)
       {
       ArrayList <Long> l1=new ArrayList<Long>();
       l1.add(ar[i]);
           for(int j=i+1;j<n;j++)
           {
               if(ar[j]>ar[i]&&ar[j]%ar[i]==0)
               {
                   l1.add(ar[j]);
               }
           }
           
          int sd=calc(l1);
          if(sd>max)
          {
              max=sd;
          }
       }
       System.out.println(Math.max(max,1));
   }
   
}
    
}
