
import java.util.Scanner;

public class MaximumIncrease {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   if(n==1)
   {
       System.out.println("1");
       System.exit(0);
   }
   long ar[]=new long[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextLong();
   }
  int max=0;
  int y=1;
  int g=0;
   for(int i=1;i<n;i++)
   {
      
       if(ar[i]>ar[i-1])
       {
        y++;  
        if(y>max)
        {
        max=y;    
        }
       }
       else{g=y;
           y=1;
           if(g>max)
           {
          max=g;
           }
       }
   }
    System.out.println(max);
}
    
}
