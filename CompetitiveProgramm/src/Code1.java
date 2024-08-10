
import java.util.Scanner;

public class Code1 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  double a=sc.nextDouble();
  double b=sc.nextDouble();
  double c=sc.nextDouble();
  double d=sc.nextDouble();
    System.out.println(a+" "+b+" "+c+" "+d);
  double p=3*a;
  double q=2*b;
    System.out.println(p+" "+q);
  double r=c;
  double x=(Math.sqrt((q*q)-(4*p*r)));
    System.out.println(x);
  double l1=(-q+x)/(2*r);
  double l2=(-q-x)/(2*r);
  double l3=(d)/(l1*l2);
    System.out.println(l1+" "+l2+" "+l3);
}
    
}
