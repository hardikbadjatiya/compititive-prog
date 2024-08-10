import java.util.Scanner;

public class NumberofWays {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int x=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       x=x+ar[i];
   }
   int z=0;
   int j=0;
       int u=0;
       int p=0;
               
   for(int i=0;i<n-2;i++)
   {
       int y=0;
       y=y+ar[i];
       if(3*y==x)
       {
           j=i;
          ++z;
          int k=0;
   for(k=j+1;k<n-1;k++)
   {
       int h=0;
       h=h+ar[k];
       if(3*h==x)
       {
           j=k;
           ++u;
            for(int l=k+1;l<n;l++)
   {
       int r=0;
       r=r+ar[l];
       if(3*r==x)
       {
           
           ++p;
       }
   }
       }
   }
     }
   }
    System.out.println(z+" "+u+" "+p);
if(z>=u&&z>=p)
{
    System.out.println(z);
}
if(u>z&&u>=p)
{
    System.out.println(u);
}
if(p>z&&p>u)
{
    System.out.println(p);
}

}
    
}
