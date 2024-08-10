
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Calsdd {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    long n=sc.nextLong();
    long m=sc.nextLong();
    long ar[]=new long[(int)n];
        ar[0]=sc.nextLong();
    long arr[]=new long[(int)n];
    arr[0]=ar[0];
    for(long i=1;i<n;i++)
    {
        ar[(int)i]=sc.nextLong();
        arr[(int)i]=ar[(int)i];
    if(ar[(int)i]==ar[(int)(i-1)]||(ar[(int)i]==0&&ar[(int)(i-1)]==0)||(ar[(int)(i)]==ar[(int)(i-1)]))
    {
        System.out.println("0");
        System.exit(0);
    }
    }
    Arrays.sort(arr);
    for(long i=1;i<n;i++)
    {
    if(arr[(int)(i)]==arr[(int)(i-1)])
    {
        System.out.println("0");
        System.exit(0);
    }
    }
    long x=1;
    BigInteger f=new BigInteger("1");
    
    if(n==1)
    {
        System.out.println(ar[0]%m+" "+2);
        System.exit(0);
    }
    for(long k=0;k<n-1;k++)
    {
        for(long l=k+1;l<n;l++)
        {
            f=f.multiply(BigInteger.valueOf((Math.max(ar[(int)k],ar[(int)l])-Math.min(ar[(int)k],ar[(int)l]))%m));
            if(f.mod(BigInteger.valueOf(m))==BigInteger.ZERO)
            {
                System.out.println("0");
                System.exit(0);
            }
        }
    }
    System.out.println(Math.max(Integer.parseInt(f.mod(BigInteger.valueOf(m)).toString()), 0));
}
    
}
