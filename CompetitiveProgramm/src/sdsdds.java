
import java.util.Scanner;

public class sdsdds {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long n=sc.nextLong();
       
       long u=0;
       
       while(n>0)
       {
            long e=0;
      long p=1;
       for(int i=0;i<=64;i++)
       {
           if(i>0)
           {
           p=p*2;
           }
           if(n>=p)
           {
               e=e+p;
           }
           else
           {
               n=n-p/2;
               u=u+e;
               break;
           }
       }
       }
       System.out.println(u);
       
   }
}
        
}
