
import java.util.Scanner;

public class BearBrother {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   double a=sc.nextDouble();
   double b=sc.nextDouble();
   double c=0;
   double d=0;
   for(int i=1;i<1000;i++)
   {
       c=a*Math.pow(3, i);
       d=b*Math.pow(2, i);
       if(c>d)
       {
           System.out.println(i);
          break; 
          
       }
       else
       {
           continue;
       }
   }
}
    
}
