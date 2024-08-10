
import java.util.Scanner;

public class sd {
     static long product(int x,int y,int k,int p,int ar[],int br[])
    {
        long t=1;
        for(int i=x;i<=y;i++)
        {
            t=t*ar[i];
        }
        for(int i=k;i<=p;i++)
        {
            t=t*br[i];
        }
        long q=0;
        if((double)Math.cbrt(t)-(long)Math.cbrt(t)==0)
        {
            q=1;
        }
        return q;
    }
   
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   while(n-->0)
   {
       int a=sc.nextInt();
       int b=sc.nextInt();
       int ar[]=new int[a];
       int br[]=new int[b];
       for(int i=0;i<a;i++)
       {
           ar[i]=sc.nextInt();
           
       }
       for(int i=0;i<b;i++)
       {
           br[i]=sc.nextInt();
       }
       int x=-2;
       int y=-2;
       long max=0;
       for(int i=0;i<a;i++)
       {
           for(int j=i+1;j<a;j++)
           {
       for(int k=0;k<b;k++)
       {
           for(int p=k+1;p<b;p++)
           {
               long s=product(i,j,k,p,ar,br);
            if(s==1)
            {
               x=j-i+1;
               y=p-k+1;
              long l=(long)Math.pow(x,2);
              long o=(long)Math.pow(y,2);
              if((l+o)>max)
              {
                  max=l+o;
              }
            }
           }
       }
           }
       }
       if(max>0)
       {
           System.out.println(max);
       }
       else{
           System.out.println("-1");
       }
       
   }
}
    
}
