
import java.util.Scanner;

public class Coder2 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int a=sc.nextInt();
       int b=sc.nextInt();
       int y=0; 
       if(a>=2*b)
        {
            y=1;
            System.out.println(a*a);
        }
        if(b>2*a)
        {
            y=1;
            System.out.println(b*b);
        }
        else if(y==0)
        {
       int x=Math.min(2*a, 2*b);
       System.out.println(x*x);
            
        }
   }
}
    
}
