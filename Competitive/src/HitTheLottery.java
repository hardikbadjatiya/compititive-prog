
import java.util.Scanner;

public class HitTheLottery {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   if(x%100==0)
   {
       System.out.println(x/100);
   }
   else
   {
       int a=0;
       int b=0;
       int y=x/100;
       int z=x%100;
       if(z%20==0)
       {
           a=z/20;
           System.out.println(a+y);
       }
       else {
               
           a=z/20;
           int t=0;
           int w=z%20;
           if(z%10==0)
           {
           t=w/10;
               System.out.println(a+y+t);
           }
           else{
               t=w/10;
               int o=0;
               int u=w%10;
               if(u%5==0)
               {
                   o=u/5;
                   System.out.println(a+y+t+o);
               }
               else{
                   o=u/5;
                   int j=0;
                  int k=w%5;
                  
                   System.out.println(a+y+t+o+k);
             
               }
           }
       }
       
   }
}
    
}
