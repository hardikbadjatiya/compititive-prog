
import java.util.Arrays;
import java.util.Scanner;

public class Cards {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
  int arr[]=new int[n];
  for(int i=0;i<n;i++)
  {
      ar[i]=sc.nextInt();
      arr[i]=i+1;
  }
  for(int j=0;j<n;j++)
  {
      for(int i=0;i<n-1;i++)
      {int x=0;
      int y=0;
          if(ar[i]>ar[i+1])
          {
              x=ar[i];
              ar[i]=ar[i+1];
              ar[i+1]=x;
              y=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=y;
          }
      }
  }
  for(int i=0;i<n/2;i++)
  {
      System.out.println(arr[i]+" "+arr[(n-1)-i]);
  }
}
    
}
