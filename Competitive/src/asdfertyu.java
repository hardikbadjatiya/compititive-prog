
import java.util.Arrays;
import java.util.Scanner;

public class asdfertyu {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
  while(t-->0)
  {
      int n=sc.nextInt();
      int x=sc.nextInt();
      int ar[]=new int[n];
      for(int i=0;i<n;i++)
      {
          ar[i]=sc.nextInt();
          
      }
  Arrays.sort(ar);
  int y=0;
  int p=-1;
  
  for(int i=n-1;i>=0;i--)
  {
      if(ar[i]>=x)
      {
         ++y; 
      }
      else{
  p=i;
  break;
      }
  }
  if(p==-1)
  {
      System.out.println(y);
  }
  else{
      int c=1;
  for(int i=p;i>=0;i--)
  {
      long yt=ar[i]*c;
      if(yt>=x)
      {
          ++y;
          c=1;
      }
      else{
          c++;
      }
  }
      System.out.println(y);
  }
  }
}
    
}
