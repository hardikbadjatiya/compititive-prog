
import java.util.Arrays;
import java.util.Scanner;

public class JavaCode1 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int k=sc.nextInt();
   for(int i=0;i<k;i++)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int ar1[]=new int[n];
       
       for(int j=0;j<n;j++)
       {
           ar[j]=sc.nextInt();
           
       }
       for(int j=0;j<n;j++)
       {
           ar1[j]=sc.nextInt();
           
       }
       Arrays.sort(ar);
       Arrays.sort(ar1);
       int c[]=new int[n];
       System.out.println("");
       for(int j=0;j<n;j++)
       {
           System.out.print(ar[j]+" ");    
       }
       System.out.println("");
       
         for(int j=0;j<n;j++)
       {
           System.out.print(ar1[j]+" ");    
       }
   }
   
}
    
}
