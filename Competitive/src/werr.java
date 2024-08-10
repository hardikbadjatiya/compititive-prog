
import java.util.Scanner;

public class werr {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in)
;
   int t=sc.nextInt();
   while(t-->0)
   {
        int a=sc.nextInt();
       int b=sc.nextInt();
       if(a*2<=b)
       {
           System.out.println(a+" "+   (2*a));
       }
       else{
           System.out.println("-1 -1");
       }
   }
   
    }
    
}
