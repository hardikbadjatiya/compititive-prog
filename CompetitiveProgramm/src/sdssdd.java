
import java.util.Scanner;

public class sdssdd {
static int calc(int ar[], int x,int y)
{
    int q=0;
    long s=0;
    for(int i=x;i<=y;i++)
    {
        s=s+ar[i];
    }
    if(Math.sqrt(s)-(long)Math.sqrt(s)==0)
    {
        q=1;
    }
    return q;
}
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    for(int p=0;p<t;p++)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
       }
       int s=0;
       for(int i=0;i<n;i++)
       {
           
       for(int j=i;j<n;j++)
       {
           s=s+ calc(ar, i, j);
           
       }   
       }
    System.out.println("Case #"+(p+1)+": "+s);
       
   }
}
}
