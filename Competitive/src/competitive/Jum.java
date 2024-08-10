package competitive;

import java.util.Arrays;
import java.util.Scanner;

public class Jum {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int x=sc.nextInt();
   int ar[]=new int[n+1];
   int arr[]=new int[n];
   
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   }
   ar[n]=x;
   
   Arrays.sort(ar);
   for(int i=0;i<n;i++)
   {
   arr[i]=Math.max(ar[i], ar[i+1])-Math.min(ar[i], ar[i+1]);
  
   }
   Arrays.sort(arr);
   int k=0;
    for(int i=arr[0];i>=1;i--)
    {
   for(int j=0;j<n;j++)
   {
       if(arr[j]%i==0)
       {
           ++k;
       }
   }
   if(k==n)
   {
       System.out.println(i);
   System.exit(0);
   }
    }
        }    
}
