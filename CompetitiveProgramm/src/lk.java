
import java.util.Scanner;

public class lk {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int p=sc.nextInt();
       int q=sc.nextInt();
       int r=sc.nextInt();
       int  l=p-a;
       int k=q-b;
       int u= r-c;
       float w=p/a;
       float o=q/b;
       float y=r/c;
       if(l!=0||k!=0||u!=0)
       {
       if(l==k||l==u)
       {
           if(k==u)
           {
           System.out.println("1");
           }
           else 
           {
               System.out.println("2");
           }
       }
       
       else{
       if(u==k)
       {
           System.out.println("2");
       }
       else{
           
           if(w==o||w==y)
           {
            if(o==y)
            {
                System.out.println("1");
            }
            else{
                System.out.println("2");
            }
           }
           else{
               if(o==y)
               {
                   System.out.println("2");
               }
               else{
                   System.out.println("3");
               }
           }
       }
       }
   }
       if(l==0||k==0||u==0)
       {
           int x=0;
          if(l!=0)
          {
          if(k==l&&k!=0)
          {
         x=1;
          }
          else{
              x=2;
          }
          }
          if(k!=0)
          {
             if(k==l)
             {
                   
             }
                 }
          if(u!=0)
          {
              ++x;
          }
           System.out.println(x);
       }
           }
}
    
}
