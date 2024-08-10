
import java.util.Arrays;
import java.util.Scanner;

public class WetShark {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   long ar[]=new long[n+1];
   ar[0]=0;
   for(int i=1;i<n+1;i++)
   {
       ar[i]=sc.nextLong();
   }
   Arrays.sort(ar);
   long x=0;
   for(int i=0;i<n+1;i++)
   {
  x=x+ar[i];
   }
   if(x%2==0)
   {
       System.out.println(x);
   }
   else
   {
   for(int i=0;i<n+1;i++)
   {
      if((x-ar[i])%2==0)
      {
          x=x-ar[i];
          System.out.println(x);
          System.exit(0);
      }
   }
   
   }
}
        
}
