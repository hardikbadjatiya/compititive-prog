
import java.util.Arrays;
import java.util.Scanner;

public class Queue {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       arr[i]=ar[i];
   }
   
   Arrays.sort(ar);
   Arrays.sort(arr);
   int x=1;
   for(int i=1;i<n;i++)
   {
       ar[i]=ar[i]+ar[i-1];
   }
   for(int i=0;i<n-1;i++)
   {
       if(arr[i+1]>=ar[i])
       {
           ++x;
       }
   }
   System.out.println(x);
}
    
}
