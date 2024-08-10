
import java.util.Scanner;

public class DoubleCol {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   double x=0;
   double y=0;
   double z=0;
   double a=0;
   for(int i=0;i<n;i++)
   {
       x= (x+5*Math.pow(2, i));
       if(x>=n)
       {
         y=i;  
         z=x-5*Math.pow(2, i);
         a=n-z;
         break;
         
       }
   }
   double w=Math.pow(2, y);
   int s=0;
   for(int i=1;i<=5;i++)
   {
       
       if((n-z)>(i*w))
       {
           s++;
           
       }
   }
   if(s==0)
   {
       System.out.println("Sheldon");
   }
   
   if(s==1)
   {
       System.out.println("Leonard");
   }
   if(s==2)
   {
       System.out.println("Penny");
   }
   if(s==3)
   {
       System.out.println("Rajesh");
   }
   if(s==4)
   {
       System.out.println("Howard");
   }
}
    
}
