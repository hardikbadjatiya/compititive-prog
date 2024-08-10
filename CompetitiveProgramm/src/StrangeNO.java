
import java.util.Scanner;

public class StrangeNO {
    static long nCr(long n, long r) 
{ 
    return fact(n) / (fact(r) * 
                  fact(n - r)); 
} 
static long fact(long n) 
{ 
    long res = 1; 
    for (long i = 2; i <= n; i++) 
        res = res * i; 
    return res; 
} 
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   
     for(int k=0;k<t;k++)
   {
       long n=sc.nextLong();
       long x=sc.nextLong();
    if(x==0)
    {
    if(n==1)
    {
        System.out.println("1");
    }
    else{
        System.out.println("0");
    }
    }
    if(x==1)
    {
        if(n>1)
        {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
    if(x==2)
    {
        int po=0;
        if(n%2==0)
        {
            po=1;
        }
        else{
        for(int i=3;i<=10;i++)
        {
            if(n==i*i)
            {
                po=1;
                break;
            }
        }
        }
        System.out.println(po);
        
    }
    else{
       long p=0;
       long e=0;
       
       for(int i=0;i<=x;i++)
       {
           p=p+nCr(x, i);
       }
       long w=n-p;
       long er=0;
       if(w==0)
       {
       er=1;
       }
       else {
       
    for(long i=2;i<=Math.sqrt(w);i++)
    {
        if(w%(i)==0)
                {
                    er=1;
                    break;
                }
    }
       }
       System.out.println(er);
   }
   }
}
    
}
