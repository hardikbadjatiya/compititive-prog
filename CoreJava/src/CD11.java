
import java.util.Scanner;

public class CD11 
{
      static long gcd(long a, long b)
 {
     if(a==0)
         return b;
     else
         return gcd(b%a,a);
 }
public static void main(String[] args) {
 Scanner sc=new  Scanner(System.in);
 int k=sc.nextInt();
 for(int t=0;t<k;t++)
 {
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int d=sc.nextInt();
     int x=a*c;
     int y=b*d;
     if((a%2==0&&b%2==0)||(x==y)||((Math.abs(x-y))%a==0)||((Math.abs(x-y))%b==0))
     {
         System.out.println("YES");
     }
     
     else{
     System.out.println("NO");
 }
 }
}
    
}
