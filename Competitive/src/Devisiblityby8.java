
import java.util.Scanner;

public class Devisiblityby8 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       long a=sc.nextInt();
       long b=sc.nextInt();
       long c=sc.nextInt();
       long d=sc.nextInt();
       long x=a+b+c+d;
       long y=x/3;
     if(y>=Math.max(a,Math.max(b,c)) && x%3==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		
   }
}
    
}
