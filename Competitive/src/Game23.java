
import java.util.Scanner;

public class Game23 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   long n=sc.nextLong();
   long m=sc.nextLong();
  long x=m/n;
   long y=m%n;
   if(n==m)
   {
       System.out.println("0");
       System.exit(0);
   }
   if(n>m||y!=0)
   {
       System.out.println("-1");
       System.exit(0);
   }
   int t=0;
   if(m>n)
   {
     for(int i=0;i<100000;i++)
     {
        if(x==1)
        {
            System.out.println(t);
            System.exit(0);
        }
        if(x%3==0)
        {
            x=x/3;
            ++t;
        }
        if(x%2==0)
        {
            x=x/2;
            ++t;
        }
           
     }
   }
    System.out.println("-1");
}
    
}
