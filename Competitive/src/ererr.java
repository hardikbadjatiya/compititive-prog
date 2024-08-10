
import java.util.Scanner;

public class ererr {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
   int d=sc.nextInt();
   int l=0;
   for(int i=a;i<=b;i++)
   {
       for(int j=c;j<=d;j++)
       {
         int x=i;
         int y=j;
           
       while(x!=y)
       {
           if(x>y)
           { 
           x=x-y;
           ++l;
           }
           if(y>x)
           {
            y=y-x;
            ++l;
           }
           if(x==y)
           {
              break; 
           }
       }
       ++l;
       }
   }
    System.out.println(l);
}
    
}
