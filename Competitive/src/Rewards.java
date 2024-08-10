
import java.util.Scanner;

public class Rewards {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int a1=sc.nextInt();
   int a2=sc.nextInt();
   int a3=sc.nextInt();
   int b1=sc.nextInt();
   int b2=sc.nextInt();
   int b3=sc.nextInt();
   int n=sc.nextInt();
   int x=(a1+a2+a3)/5;
   int y=(b1+b2+b3)/10;
   int u=(a1+a2+a3)%5;
   int v=(b1+b2+b3)%10;
   if(u==0&&v==0)
   {
       if((x+y)<=n)
       {
           System.out.println("YES");
       }
       else {
       System.out.println("NO");
   }
   }
   else if(u!=0&&v==0)
   {
       if((x+y+1)<=n)
       {
           System.out.println("YES");
       
       }
       else {
       System.out.println("NO");
   }
   }   
      else if(u==0&&v!=0)
   {
       if((x+y+1)<=n)
       {
           System.out.println("YES");
       }
       else {
       System.out.println("NO");
   }
   } 
   else if(u!=0&&v!=0)
   {
       if((x+y+1+1)<=n)
       {
           System.out.println("YES");
       }
       else {
       System.out.println("NO");
   }
   }
   
}
        
}
