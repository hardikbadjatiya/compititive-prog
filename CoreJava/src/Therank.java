
import java.util.Arrays;
import java.util.Scanner;

public class Therank {

public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
       int x=0;
       for(int j=0;j<4;j++)
       {
          int y=sc.nextInt();
          x=x+y;
       }
       ar[i]=x;
       arr[i]=i+1;
   }
  for(int i=0;i<n;i++)
  {
      for(int j=0;j<n-1;j++)
      {
          int x=0;
          int y=0;
          if(ar[j]<ar[j+1])
          {
             x=ar[j];
             ar[j]=ar[j+1];
             ar[j+1]=x;
             y=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=y;
          }
      }
      
  }
  for(int i=0;i<n;i++)
  {
      if(arr[i]==1)
      {
          System.out.println(i+1);
      }
  }
}    
}
