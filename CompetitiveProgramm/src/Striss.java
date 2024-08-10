
import java.math.BigInteger;
import java.util.Scanner;

public class Striss {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   String w=sc.next();
    int n=s.length();
    int q=w.length();
   BigInteger bNum1 = new BigInteger(s);
   
    BigInteger bNum2 = new BigInteger(w);
    String st=" ";
    long x=0;
    BigInteger i;
    
    for(BigInteger i=bNum1;i<=bNum2;i++)
    {
        for(long j=i;j<=b;j++)
        {
          long w=i^j;
        String s=" "+w+" ";
        if(st.contains(s)!=true)
        {
            x++;
            st=st+w+" ";
        }
        }
    }
    System.out.println(x);

   
}
    
}
