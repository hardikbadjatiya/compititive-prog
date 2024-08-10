
import java.util.Scanner;

public class PrimePhtho {
    static long phytho(long h, long ba, long p)
    {
        long x=0;
        if(h*h==(ba*ba)+(p*p))
        {
x=1;

        }
    return x;
        
    }
    static long hcf(long h, long ba, long p )
    {
        int x=1;
       for(int i=2;i<Math.min(ba, p);i++)
       {
           if((h%i==0&&p%i==0)||(h%i==0&&ba%i==0)||(ba%i==0&&p%i==0))
           {
               x=0;
               break;
           }
       }
        
        return x;
        
    }
    
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int k=sc.nextInt();
   for(int i=0;i<k;i++)
   {
       long a=sc.nextLong();
       long b=sc.nextLong();
       long c=sc.nextLong();
        long h=0;
        long ba=0;
        long p=0;
       int y=0;
        if(a>b&&a>c)
       {
           h=a;
           ba=b;p=c;
            if(PrimePhtho.phytho(h, ba, p)==1)
            {
                if(PrimePhtho.hcf(h, ba, p)==1)
                {
               y=1;
                }
            }
       }
        if(c>b&&c>a)
       {
           h=c;
           ba=a;p=b;
            if(PrimePhtho.phytho(h, ba, p)==1)
            {
                if(PrimePhtho.hcf(h, ba, p)==1)
                {
               y=1;
                }
            }
       }
        if(b>a&&b>c)
       {
           h=b;
           ba=a;p=c;
            if(PrimePhtho.phytho(h, ba, p)==1)
            {
                if(PrimePhtho.hcf(h, ba, p)==1)
                {
               y=1;
                }
            }
       }
        if(y==1){
            System.out.println("YES");
        }
        if(y==0){
            System.out.println("NO");
        }
       
       
   }
   
}
    
}
