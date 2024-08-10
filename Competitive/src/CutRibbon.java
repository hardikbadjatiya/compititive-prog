
import java.util.Scanner;

public class CutRibbon {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
  int x,y,z,d,e,f;
  
   if(a>=b&&a>=c)
   {
   x=Math.min(b, c);
   y=n/x;
   if(n%x==0)
   {
       System.out.println(y);
   }
   else{
       
   }
   }
   else if(b>a&&b>=c)
   {
       
   }
   else if(c>=a&&c>b)
   {
       
   }
  x=n/a;
  y=n/b;
  z=n/c;
  
}
    
}
