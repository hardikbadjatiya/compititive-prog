
import java.util.Scanner;

public class Maximalrest {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int x=1;
   int max=1;
   
 int p=0;  for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       if(ar[i]==0)
       {
           ++p;
       }
   }
   
   if(p==n)
   {
       System.out.println("0");
       System.exit(0);
   } 
   
   for(int i=1;i<n;i++)
   {
       
       if(ar[i]==ar[i-1]&&ar[i]==1)
       {
           x=x+1;
           if(x>max)
       {
           max=x;
       }
       }
       
       else {
           if(x>max)
       {
           max=x;
           x=1;
       }
           else{
               x=1;
           }
   }
       
   }
  
   int a=0;
   if(ar[0]==ar[n-1]&&ar[0]==1)
   {a=2;
      for(int i=1;i<n;i++)
      {
          if(ar[i]==ar[0])
          {
              ++a;
          }
          else{
              break;
          }
      }
      for(int i=n-2;i>0;i++)
      {
 
          if(ar[i]==ar[0])
          {
              ++a;
          }
          else{
              break;
          }
      }
   }
   
    System.out.println(Math.max(a, max));
    
}
    
}
