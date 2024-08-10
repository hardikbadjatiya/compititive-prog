
import java.util.Arrays;
import java.util.Scanner;
import static oracle.net.aso.C01.j;

public class KefaFirstSteps {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   }
   int a[]=new int[n-1];
 int j=0;
   for(int i=0;i<n-1;i++)
   {
       a[i]=ar[i+1]-ar[i];
       if(a[i]<0)
       {
           ++j;
       }
   }
   int b[]=new int[j];
   int c[]=new int[j];
   if(j==0)
   {
       System.out.println(n);
   }
   else{for(int k=0;k<j;j++)
   {
       for(int i=0;i<n;i++)
       {
          if(a[i]<0)
          {
              b[k]=i;
             
          }
       }
      for(int l=0;l<j;l++)
      {
          if(l==0)
          {
              c[l]=b[l]-0;
          }
          else{
              c[l]=b[l]-b[l-1];
          }
      }
      Arrays.sort(c);
       System.out.println(c[j-1]);
   }
   }

//   while( j++>0)
//  { for(int i=0;i<n-1;i++)
//   {
//       if(a[i]<=0)
//       {
//           ar[]
//       }
//   }
//  }
  
}
    
}
