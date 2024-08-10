
import java.util.Scanner;

public class Squre {
    static int check(long x)
    {
        int q=0;
        double w=x;
        if(x==25)
        {
            return 1;
        }
        if(Math.sqrt(w)-(long)Math.sqrt(w)==0)
          {
           long k=(long)Math.sqrt(w);
          if(k%2==0)
          {
          q=1;
          return q;
          }
          long sw=(long)Math.sqrt(k);
          
          if(k-sw*sw==1)
          {
          q=0;
          return q;
          }
          else
          {
              q=0;
              return q;
          }
          }
          else{
              long h=(long)Math.sqrt(x)+1;
              long o=h*h-x;
          if(Math.sqrt(o)-(long)Math.sqrt(o)==0)
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
               p=p+check(x);
               
           }
       }
       System.out.println(p);
   }   
}
}