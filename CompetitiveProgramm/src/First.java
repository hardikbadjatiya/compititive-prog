
import java.util.Scanner;

public class First {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int  t=sc.nextInt();
   while(t-->0)
   {
       long x=sc.nextLong();
       long y=sc.nextLong();
       long a=sc.nextLong();
       long b=sc.nextLong();
       long q=0;
       int o=0;
       if(a>=b)
       {
       q=b*Math.min(x,y)+a*(Math.max(x, y)-Math.min(x, y));
       o=1;
       }
       if(2*a>=b&&o==0)
       {
           o=1;
       q=b*Math.min(x,y)+a*(Math.max(x, y)-Math.min(x, y));
       }
       if(b>2*a&&o==0)
       {
           q=(x+y)*a;
       }
       System.out.println(q);
   }
}
    
}
