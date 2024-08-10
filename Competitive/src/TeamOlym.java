
import java.util.Scanner;

public class TeamOlym {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int x=0;
   int y=0;
   int z=0;
   int ar1[]=new int[n];
   int ar2[]=new int[n];
   int ar3[]=new int[n];
   
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       if(ar[i]==1)
       {
           x=x+1;
        
       }
        if(ar[i]==2)
       {
           y=y+1;
       }
         if(ar[i]==3)
       {
           z=z+1;
       }
   }
      if(z<x||z<y)
      {
          System.out.println(z);
      }
      else if(x<y||x<z)
      {
          System.out.println(x);
      }
      
}
    
}
