
import java.util.Scanner;

public class SoftDrinking {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   int d=sc.nextInt();
   int e=sc.nextInt();
   int f=sc.nextInt();
   int g=sc.nextInt();
   int h=sc.nextInt();
   int x=(b*c)/g;
   int y=d*e;
   int z=f/h;
   if(x>=y&&x>=z)
   {
       System.out.println(Math.min(y, z)/a);
   }
   if(y>x&&y>=z)
   {
       System.out.println(Math.min(x, z)/a);
   }
   if(z>x&&z>y)
   {
       System.out.println(Math.min(y, x)/a);
   }
   
   
}
    
}
