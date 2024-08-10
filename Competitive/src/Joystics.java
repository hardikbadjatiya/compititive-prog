
import java.util.Scanner;

public class Joystics {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int x=0;
   
       while ((a>=1&&b>=2)||(a>=2&&b>=1))
       {
          if(a>=b&&((a>=1&&b>=2)||(a>=2&&b>=1)))
          {
              a=a-2;
           ++x;
              b=b+1;
          }
          else if(b>a&&((a>=1&&b>=2)||(a>=2&&b>=1))){
              a=a+1;
              b=b-2;
          ++x;
          }
   }
       System.out.println(x);
       
}
    
}
