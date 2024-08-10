
import java.util.Arrays;
import java.util.Scanner;

public class sdsdsds 

{
    static int[] shi(int ar[])
    {
       int n=ar.length;
      int a[]=new  int[n];
      for(int i=0;i<n-1;i++)
       {
      a[i]=ar[i+1];     
       }
      a[n-1]=ar[0];
      return a;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int arr[]=new int[n];
   int aw[]=new int[n];
   int af[]=new int[n];
   
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       aw[ar[i]-1]=i;
   }
   for(int i=0;i<n;i++)
   {
       arr[i]=sc.nextInt();
       af[arr[i]-1]=i;
   }
   
   int max=0;
   int w[]=new int[n+1];
   for(int i=0;i<n;i++)
   {
       int y=aw[ar[i]-1]-af[ar[i]-1];
       if(y>=0)
       {
          w[y]++;
       }
       else{
           w[y+n]++;
       }
   }
for(int i=0;i<n;i++)
{
    max=Math.max(w[i],max);
}
    System.out.println(max);
}
    
}
