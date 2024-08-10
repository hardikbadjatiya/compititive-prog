
import java.util.Scanner;

public class Program {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int y=sc.nextInt();
   int b=sc.nextInt();
   int r=sc.nextInt();
   if(y>=b&&y>=r)
   {
       if(b>=r)
       {
           System.out.println(r+r-1+r-2);
       }
       else
       {
           System.out.println(b+1+b+b-1);
       }
   }
   if(b>y&&b>=r)
   {
       if(y>=r)
       {
           System.out.println(r+r-1+r-2);
           
       }
       else{
           System.out.println(y+y+1+y+2);
       }
   }
   if(r>b&&r>y)
   {
       if(b>=y)
       {
           System.out.println(y+2+y+1+y);
       }
       else{
           System.out.println(b+1+b+b-1);
       }
   }
   
   
}
        
}
