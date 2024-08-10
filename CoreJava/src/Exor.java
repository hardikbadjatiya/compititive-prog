
import java.util.Scanner;

public class Exor {
    static long per(long p, long x)
    {
        x++;
      
      long u=x^p;
       if(u==p+x)
       {
           return x;
       }
       
    return per(p,x);
       
       
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int k=0;k<n;k++)
   {
       long p=sc.nextLong();
       long q=per(p,0);
      
       System.out.println(q);
   }
}
    }
