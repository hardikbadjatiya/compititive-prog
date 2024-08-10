
import java.util.Scanner;

public class PatrickShop {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int d1=sc.nextInt();
   int d2=sc.nextInt();
   int d3=sc.nextInt();
   int a=Math.min(d1, d2);
   int b=Math.min(d1+d2, d3);
   int c=Math.min(d1+d2-a, b+a);
    System.out.println(a+b+c);
}
        
}
