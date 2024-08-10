
import java.util.Scanner;

public class wee {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int x=sc.nextInt();
       int y=sc.nextInt();
       int o=1;
       while(x>y)
       {
         x=x-y;
         y=y/2;
         if(x<=0)
         {
             o=1;
             break;
         }
         if(y==0){
             o=0;
             break;
         }
       }
       System.out.println(o);
   }
}
    
}
