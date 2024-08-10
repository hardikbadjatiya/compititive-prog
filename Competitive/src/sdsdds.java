
import java.util.Scanner;

public class sdsdds {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int p=sc.nextInt();
       int q=sc.nextInt();
       int y=p%q;
       int u=0;
       while(n-->0)
       {
           int o=0;
           for(int i=0;i<10;i++)
           {
               y=y*10;
               if(y>=q)
               {
               u=u+y/q;
               y=y%q;
               if(y==0)
               {
                 o=1;  
               }
               break;
               }
               
           }
           if(o==1)
           {
              break; 
           }
       }
       System.out.println(u);
   }
}
    
}
