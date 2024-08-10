
import java.util.Scanner;

public class Swraasasa {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    for(int k=0;k<t;k++)
    {
       int n=sc.nextInt();
       long ar[]=new long[n];
       long arr[]=new long[n];
       for(int i=0;i<n;i++)
       {
           int o=0;
           ar[i]=sc.nextLong();
           long x=ar[i]%4;
           if(ar[i]==0&&o==0)
           {
               arr[i]=0;
               o=1;
           }
           if(ar[i]%4==0&&o==0)
           {
               arr[i]=4;
               o=1;
           }
           if( ar[i]%2==0&&ar[i]%4!=0&&o==0)
           {
               arr[i]=2;
               o=1;
           }
           if(o==0)
           {
               arr[i]=1;
           }
       }
       long p=0;
       for(int i=0;i<n;i++)
       { 
           long x=1;
           for(int j=i;j<n;j++)
           {
               x=x*arr[j];
             
               if(x==2)
             {
                 ++p;
             }
             if(x==0||x%4==0)
              {
             break;
              }
             
            }
       }
       long y=(n*(n+1))/2-p;
       System.out.println(y);
    }
}
}
