
import java.math.BigInteger;
import java.util.Scanner;

public class df {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
  int t=n;
   long w=0;
    BigInteger a = new BigInteger("0");
   
  while(n-->0)
  {
      w=sc.nextLong();
      String s=Long.toString(w);
    BigInteger f = new BigInteger(s);
     a = a.add(f);
      
  }
  String k=""+t;
  BigInteger as=new BigInteger(k);
  a=a.divide(as);
    System.out.println(a);
     
}
    
}
