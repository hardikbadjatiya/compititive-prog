
import java.util.Scanner;

public class Modular {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   long n=sc.nextLong();
   long m=sc.nextLong();
   long x=(long)Math.pow( 2, n);
   long y=m%x;
    System.out.println(y);
}
    
}
