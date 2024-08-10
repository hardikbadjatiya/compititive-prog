
import java.util.Scanner;

public class LLyaBank {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int x=sc.nextInt();
//   if(x>=0)
//   {
//       System.out.println(x);
//   }
//   else{
//       if(x>= -10)
////       int y=Math.max(x/10, x%10);
////       System.out.println(y);
//       {
//           System.out.println(x%10);
//       }
//       else{
//           System.out.println(x/10);
//       }
//   }
    int a=x/10;
    int b=(x/100)*10+x%10;
    System.out.println(Math.max(x, Math.max(a, b)));
}
    
}
