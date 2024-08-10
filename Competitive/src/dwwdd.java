
import java.util.Scanner;

public class dwwdd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long a=sc.nextLong();
       long b=sc.nextLong();
       long x=sc.nextLong();
       long y=sc.nextLong();
       if(Math.min(a, b)>=y&&a+b>=x+y)
       {
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
   }
}
    
}
