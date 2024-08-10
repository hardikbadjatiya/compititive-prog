
import java.util.Arrays;
import java.util.Scanner;

public class Code10 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       int mean=sc.nextInt();
       long ar[]=new long[n];
       long arr[]=new long[n];
       long p=0;
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextLong();
           arr[i]=ar[i]-mean;
           p=p+arr[i];
       }
      Arrays.sort(arr);
      int w=0;
      int max=0;
      if(p>=0)
      {
          System.out.println(n);
      }
      else{
      for(int i=0;i<n;i++)
      {
          p=p-arr[i];
          if(p>=0)
          {
              w=n-i-1;
              break;
          }
      }
       System.out.println(w);
   }
   }
}
}
