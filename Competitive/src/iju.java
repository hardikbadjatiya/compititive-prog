
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class iju {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   int ar[]=new int[n];
   int a[]=new int[n];
   int b[]=new int[n];
   int u=0;
   int y=0;
   int r[]=new int[n];
   int w[]=new int[n];
   
   ArrayList <Integer> al=new ArrayList<Integer>();
   ArrayList <Integer> bl=new ArrayList<Integer>();
   ArrayList <Integer> cl=new ArrayList<Integer>();
      
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       r[i]=ar[i];
       w[i]=i;
       a[i]=sc.nextInt();
       b[i]=sc.nextInt();
       if(a[i]==1)++u;
       if(b[i]==1)++y;
       if(a[i]==1&&b[i]==1)
       {
           cl.add(ar[i]);
       }
       if(a[i]==1&&b[i]==0)
       {
       al.add(ar[i]);    
       }
       if(a[i]==0&&b[i]==1)
       {
       bl.add(ar[i]);    
       }
  }
   
   if(u>=k&&y>=k)
   {
        Collections.sort(al);
   Collections.sort(bl);
  
   for(int i=0;i<Math.min(al.size(), bl.size());i++)
   {
       int h=al.get(i)+bl.get(i);
       cl.add(h);
   }       
    Collections.sort(cl);
    int rl=0;
    for(int i=0;i<k;i++)
    {
        rl=rl+cl.get(i);
    }
    
       System.out.println(rl);
   }
   else{
       System.out.println("-1");
   }
   
}
    
}
