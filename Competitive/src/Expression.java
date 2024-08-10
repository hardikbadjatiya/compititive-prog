
import java.util.Arrays;
import java.util.Scanner;

public class Expression {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
   int z=sc.nextInt();
int a=x*(y+z);
   int b=(x+y)*z;
   int c=x+(y*z);
   int d=x*y*z;
   int e=x+y+z;
   int ar[]={a,b,c,d,e};
    Arrays.sort(ar);
    System.out.println(ar[4]);
}
    
}
