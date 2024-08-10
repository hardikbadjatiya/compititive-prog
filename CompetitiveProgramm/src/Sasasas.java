
import java.math.BigInteger;
import java.util.Scanner;

public class Sasasas {
    public static void main(String[] args) {
   

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
       BigInteger s=new BigInteger("212072634227239451");
       long w=0;
       for(int i=0;i<n;i++)
       {
       long ar[]=new long[m];
       BigInteger a=new BigInteger("1");
       for(int j=0;j<m;j++)
       {
          ar[j]=sc.nextLong();
          a = a.multiply(BigInteger.valueOf(ar[i]));
       }
       if(a.equals(s))
       {
          w=w;  
       }
       else
       {
            w++;
       }
       
       }
        System.out.println(w);
  }
}