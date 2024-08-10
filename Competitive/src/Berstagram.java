
import java.util.Arrays;
import java.util.Scanner;

public class Berstagram {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int a[]=new int[n];
   int b[]=new int[n];
   for(int i=0;i<n;i++)
   {
       a[i]=i+1;
       b[i]=i+1;
   }
  
   int m=sc.nextInt();
   for(int i=0;i<m;i++)
   {   int d=sc.nextInt();
   if(d==1)
   {
       break;
   }
   for(int j=0;j<n;j++)
            {
   int k=0;
  
        if(a[j]==d)
        {     k=a[j-1];
           a[j-1]=a[j-2];
           a[j-2]=k;
       }
            }
   }
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
   
    int c[]=new int[n];
   for(int i=0;i<n;i++)
   {
       for(int j=0;j<n;j++)
       {
        if(a[i]==b[j])
        {
       System.out.println(Math.min(i+1,j+1)+" "+Math.max(i+1, j+1));
   
        }
   }
   }
}

}
