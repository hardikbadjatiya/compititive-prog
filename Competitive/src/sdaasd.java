
import java.util.Arrays;
import java.util.Scanner;

public class sdaasd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
      int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
         a[i]=sc.nextInt();
         
     }
     Arrays.sort(a);
     int b[]=new int[n];
   int k=1,j=0,l=n-1;
      for(int i=0;i<n;i++)
      {
          if(k==1)
          {
              b[j]=a[i];
              k=-1;
              j++;
          }
          else if(k==-1)
          {
              b[l]=a[i];
              k=1;
              l--;
          }
      }
      int x=0;
      for(int i=1;i<n;i++)
      {
          if(b[i]==b[i-1])
          {
             x=1;
             break;
          }
      }
      if(x==1)
      {
          System.out.println("NO");
      }
      else{
          System.out.println("YES");
          String s="";
          for(int i=0;i<n;i++)
          {
              s=s+b[i]+" ";
          }
          System.out.println(s);
      }
   }
}
    
}
