

import java.util.Scanner;

public class Square22
{
    static long pow(long x, long q)
    {
        if(x%2==0)
        {
            x=x/2;
            ++q;
            return pow(x,q);
        }
      return q;
    }
      static int check(long x)
    {
        int q=0;
        double w=x;
        if(Math.sqrt(w)-(long)Math.sqrt(w)==0)
          {
           long k=(long)Math.sqrt(w);
           long u=2*k+1;
        if(Math.sqrt(u)-(long)Math.sqrt(u)==0)
          {
              q=1;
              return q;
          }   
        else{
            return 0;
            }
          }
        else{
              long h=pow(x, 0);
              if(h%2==0)
              {
                  q=1;
              }
         } 
        return q;
   }
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
       int p=0;
       for(int i=0;i<n;i++)
       {
           long x=1;
           for(int j=i;j<n;j++)
           {
               x=x*ar[j];
               if(x==0)
               {
                  ++p;
               }
             if(x%2!=0)
              {
                  ++p;
              }
              else
             {
                  p=p+check(x);
             }
              }
       }
       System.out.println(p);
       
    }
   }
   }