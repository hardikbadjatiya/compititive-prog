

import java.util.Scanner;

public class Sqre
{
//    static long power(long x, long q)
//    {
//        if(x%4==0)
//        {
//            x=x/4;
//            ++q;
//            return power(x,q);
//        }
//        if(x%2==0)
//        {
//            q=0;
//            return 0;
//        }
//      return 1;
//    }

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    for(int k=0;k<t;k++)
    {
       int n=sc.nextInt();
       long ar[]=new long[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextLong();
       }
       long p=0;
       for(int i=0;i<n;i++)
       {
           long x=1;
           for(int j=i;j<n;j++)
           {
             x=x*ar[j];
             int l=0;
             if(x==0||x%4==0)
              {
                  ++l;
             p=p+n-j;
             break;
              }
             if(x%2!=0&&l==0)
             {
                 ++p;
             }
              }
       }
       System.out.println(p);
    }
   }
   }