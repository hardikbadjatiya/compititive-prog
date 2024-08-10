
import java.util.Arrays;
import java.util.Scanner;

public class ploi {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int k=sc.nextInt();
       int z=sc.nextInt();
       int ar[]=new int[n];
       int a[]=new int[n];
        
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           a[i]=ar[i];
       }  
       Arrays.sort(a);
       
   }
}
    
}
