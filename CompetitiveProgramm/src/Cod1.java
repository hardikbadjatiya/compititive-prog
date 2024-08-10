
import java.util.Scanner;

public class Cod1 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
        long n=sc.nextLong();
        long k=sc.nextLong();
       int x=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
               x=i;
               break;
            }
        }
        long h=0;
        if(x==0)
        {
           h=2*n+(k-1)*2;
        }
        if(x>=2)
        {
            n=n+x;
            k=k-1;
           h=n+(k)*2;
        }
        System.out.println(h);
   }
   
}
    
}
