
import java.util.Arrays;
import java.util.Scanner;

public class Sale {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   Arrays.sort(ar);
   int x=0;
   for(int i=0;i<m;i++)
   {
       if(ar[i]<=0)
       x=x+ar[i];
   }
    System.out.println(-x);
}
    
}
