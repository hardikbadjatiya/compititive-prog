
import java.util.Arrays;
import java.util.Scanner;

public class frtrt {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   for(int i=1;i<n;i++)
   {
       ar[i]=ar[i]+ar[i-1];
   }
   int k=sc.nextInt();
   Arrays.sort(ar);
   for(int i=0;i<k;i++)
   {
       int x=sc.nextInt();
       int u=Arrays.binarySearch(ar, x);
       if(u>=0)
       {
           System.out.println(u+1);
       }
       else{
           System.out.println(-u); 
       }
   }
}
    
}
