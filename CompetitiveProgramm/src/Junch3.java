
import java.util.Scanner;

public class Junch3 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long s=sc.nextInt();
       int y=0;
       for(int i=1;i<64;i++)
       {
           if(s%(long)Math.pow(2, i)!=0)
           {
               y=i-1;
               break;
           }
       }
       if(y==0)
       {
           System.out.println(s/2);
       }
       else{
             long o=0;
               if(s>=(long)Math.pow(2, y+1))
               {
               long p=s/(long)Math.pow(2, y+1);
               o=o+p;
               }

           System.out.println(o);
       }
   }
}
    
}
