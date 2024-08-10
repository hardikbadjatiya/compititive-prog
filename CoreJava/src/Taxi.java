
import java.util.Scanner;

public class Taxi {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int a=0;
   int b=0;
   int c=0;
   int d=0;
   int e=0;
   int sum=0;
   for(int i=0;i< n;i++)
   {
      ar[i]=sc.nextInt();
      sum=sum+ar[i];
      if(ar[i]==1)
      {
         a=a+1;
      }
      else if(ar[i]==2)
      {
          b=b+1;
          
      }
    else  if(ar[i]==3)
      {
          c=c+1;
      }
    else if(ar[i]==4)
      {
          d=d+1;
      }
     
      
      
   }
//    System.out.println(b);
   
if(a==n)
   {
       if(n%4==0)
       {
           e=a/4;
           System.out.println(e);
       }
       else
       {
           e=a/4;
           System.out.println(e+1);
       }
   }
   
   else if(b==n)
   {
       if(n%2==0)
       {
           e=b/2;
           System.out.println(e);
       }
       else
       {
           e=b/2;
           System.out.println(e+1);
       }
   }else if(c==n)
   {
       System.out.println(c);
   }else if(d==n)
   {
       System.out.println(d);
   }
   else
   
   if(a==1&&b==1)
   {
       e=(1+c+d);
       System.out.println(e);
   }else if(a==1&&b>=1&&c==1)
       
           {
               e=(1+b+d);
               System.out.println(e);
            }
   else if(b%2==0)
   {
       if(a==c)
       {
           e=a+(b/2)+d;
              System.out.println(e);
            
       }
       else if(a>c)
       {
           e=a+(b/2)+d;
              System.out.println(e);
            
       }
       
       else if(a<c)
       {
           e=c+(b/2)+d;
              System.out.println(e);
            
       }
   }   
   
   else if(a==c)
   {
       e=a+b+d;
       System.out.println(e);
   }
   else if(a==b)
   {
       e=a+c+d;
      // int f=e;
       System.out.println(e);
   }
   else if(b==c)
   {
       e=a+b+c+d;
       System.out.println(e);
   }
   
   else
   {
       if(sum%4==0)
       {
           System.out.println(sum/4);
       }
       else
       {
           System.out.println(e);
       }
   }
}
}
