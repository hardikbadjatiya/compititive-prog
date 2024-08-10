
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   long ar[]=new long[n];
   long x=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       x=x+ar[i];
       
   }
   Arrays.sort(ar);
   for(int i=0;i<n;i++)
   {
       if(ar[i]*n>x)
       {
           System.out.println(ar[i]);
           System.exit(0);
       }
   }
}
    
}
