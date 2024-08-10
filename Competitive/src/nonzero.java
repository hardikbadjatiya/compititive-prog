
import java.util.Scanner;

public class nonzero {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int z=0;
       for(int i=0;i<n;i++)
       {
       ar[i]=sc.nextInt();
       if(ar[i]==0)
       {
           ++z;
           ar[i]=1;
       }
       }
       int w=0;
       for(int i=0;i<n;i++)
       {
           w=w+ar[i];
       }
       if(w==0)
       {
         z=z+Math.abs(w-0)+1;  
       }
       System.out.println(z);
   }
}
        
}
