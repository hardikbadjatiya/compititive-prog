
import java.util.Scanner;

public class DieRoll {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=Math.max(a, b);
   int d=Math.min(a, b);
   if(c==6)
   {
       System.out.println("0/1");
   }
   else if(c<6)
   {
       if(a!=b)
       {
       int x=6-c;
       int y=4;
       if(x%2==0&&x%4!=0)
       {
           System.out.println(x/2+"/2");
       }
         else if(x%2==0&&x%4==0)
       {
           System.out.println(x/4+"/1");
       }
       else{
           System.out.println(x+"/4");
       }}
       else{
           int x=6-c;
           if(x==5)
           {
               System.out.println("1/1");
           }
           else{
               
               System.out.println(x+"/5");
           }
       }
       
       }
}
        
}
