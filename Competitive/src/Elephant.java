
import java.util.Scanner;

public class Elephant {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int x=0;
   if(n>5)
   {
       x=n/5;
       if(n%5==0)
       {
           System.out.println(x);
       }
       else
       {       System.out.println(x+1);
       }
   }
   else
   {
       System.out.println("1");
   }
}
    
}
