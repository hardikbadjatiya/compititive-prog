
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class wertrreeqw {

    public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
   int n=sc.nextInt();
   int k=sc.nextInt();
   int ar[]=new int[n];
   int min=1999999999;
   
   int op=0;
   HashSet <Integer> hs=new HashSet<Integer> ();
    TreeSet <Integer> ts=new TreeSet<Integer> ();
    
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       hs.add(ar[i]);
   }
    for(int i=0;i<n;i++)
   {
       if(k%ar[i]==0)
       {
           int u=0;
          for(int j=2;j<k/ar[i];j++)
          {
             if(hs.contains(ar[j]*i)!=true)
             {
             u=1;    
             }
          }
            if(u==0)
            {
                if(k/ar[i]<min)
                {
                    
                }
            }
          
           }
   }
    
       if(ts.size()==0)
       {
           min=-1;
       }
       min=ts.first();
        System.out.println(min);
   
   }
}
}
