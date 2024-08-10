
import java.util.Scanner;

public class olj {
   static int gcd(int a,int b)
    {
        if(a==0)
            return b;
        else
            return gcd(b%a,a);
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int a=sc.nextInt();
        int b=sc.nextInt();
        int y=gcd(a,b);
   
   }
}
    
}
