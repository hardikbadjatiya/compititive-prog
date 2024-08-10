
import java.util.Scanner;

public class Mainsd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
  int t=sc.nextInt();
  while(t-->0)
  {
      long n=sc.nextLong();
      long y=sc.nextLong();
      if(n==y)
      {
          System.out.println(0);
      }
      if(n>y)
      {
          if(n%y==0)
          {
              long w=n/y;
              long p=0;
              long r=0;
               if(w%2==0)
               {
                   for(int i=1;i<=64;i++)
                   {
                       if(w==(long)Math.pow(2, i))
                       {
                           p=i;
                           break;
                       }
                   }
                   if(p>0)
                   {
                      r=p/3;
                       long q=p%3;
                       long a=q/2;
                       long b=q%2;
                       long l=b;
                    System.out.println(r+a+b);
                  }
                  else
                  {
                      System.out.println("-1");
                  }
               }
               else
          {
              System.out.println(-1);
          }
          }
          else
          {
              System.out.println(-1);
          }
      }
      if(n<y)
      {
          if(y%n==0)
          {
              long w=y/n;
              long p=0;
              long r=0;
               if(w%2==0)
               {
                 for(int i=1;i<=64;i++)
                   {
                       if(w==(long)Math.pow(2, i))
                       {
                           p=i;
                           break;
                       }
                   }
                   if(p>0)
                   {
                      r=p/3;
                       long q=p%3;
                       long a=q/2;
                       long b=q%2;
                       long l=b;
                    System.out.println(r+a+b);
               }
               else
          {
              System.out.println(-1);
          }     

               }
          else
          {
              System.out.println(-1);
          }     
      }
          else
          {
              System.out.println(-1);
          }
  }
      
   
  }    
  }
}
