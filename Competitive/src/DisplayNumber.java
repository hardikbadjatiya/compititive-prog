
import java.util.Scanner;

public class DisplayNumber {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int x=0;
   int y=0;
   for(int i=0;i<n;i++)
   {
       int u=sc.nextInt();
       System.out.println("");
       if(u==2)
       {
           System.out.println(1);
       }
       if(u==3)
       {
           System.out.println(7);
       }
       if(u>3)
       {
          x=u%2;
          y=u/2;
          if(x==0)
          {
             for(int j=0;j<y;j++)
             {
                 System.out.print(1);
             }
          }
          else{
              System.out.print(7);
              
             for(int j=0;j<y-1;j++)
             {
                 System.out.print(1);
             }
          }
       }
      
   }
}
    
}
