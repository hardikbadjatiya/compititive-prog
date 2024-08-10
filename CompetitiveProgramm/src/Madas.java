
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Madas {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int x[]=new int[n];
   int y[]=new int[n];
   int z[]=new int[n];
 int k[]=new int[n];
   int l[]=new int[n];
   
   int x1=1;
   int x2=1;
   
   for(int j=0;j<n;j++)
   {
       
       x[j]=sc.nextInt();
       y[j]=sc.nextInt();
       z[j]=x[j]+y[j];
       k[j]=x[j];
       l[j]=y[j];
       
   }
   
   for(int i=0;i<n-1;i++)
   {
       for(int j=0;j<n-1;j++)
       {
           if(z[j]>=z[j+1])
           {
               int q=z[j];
               z[j]=z[j+1];
               z[j+1]=q;
               int a=x[j];
               x[j]=x[j+1];
               x[j+1]=a;
               int b=y[j];
               y[j]=y[j+1];
               y[j+1]=b;
           }
       }
       
   }
    
  for(int i=0;i<n;i++)
  {
      
      for(int j=0;j<n;j++)
      {
        if(k[i]==x[j]&&l[i]==y[j])
        {
            System.out.println(j);
            break;
        }
      }
  }
   
}
    
}
