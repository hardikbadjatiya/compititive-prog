
import java.util.Scanner;


public class Triangle {

public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       long a=sc.nextLong();
       long b=sc.nextLong();
       long c=sc.nextLong();
       long d=sc.nextLong();
       int x=0;
       if(b+c>d&&x==0)
       {x=1;
           System.out.println(b+" "+c+" "+d);
       
       }
       else if(a+b>c&&x==0)
       {
           System.out.println(a+" "+b+" "+c);
       x=1;
       }
       else if(x==0){
       System.out.println(b+" "+c+" "+c);
       
       }
   }
}
}
