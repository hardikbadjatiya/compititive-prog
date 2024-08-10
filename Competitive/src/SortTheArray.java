
import java.util.Scanner;

public class SortTheArray {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   int x=0;
   int a[]=new int[10000];
   for(int i=0;i<n;i++)
   {
       for(int j=i+1;j<n-1;j++)
       {
           if(ar[i]>ar[j])
           {
               ++x;
               
           }
       }
   }
}
    
}
