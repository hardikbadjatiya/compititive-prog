
import java.util.Scanner;

public class LunchRush {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int max=0;
       int c=sc.nextInt();
       int d=sc.nextInt();
       if(d>k)
       {
         max=c+k-d;
       }
       else
       {
           max=c;
       }
   for(int i=0;i<n-1;i++)
   {
       int f=sc.nextInt();
       int t=sc.nextInt();
       if(t>k)
      {
          int x=f-t+k;
           if(x>max)
           {
               max=x;
           }
      }
        else{
               if(max<f)
               {
                   max=f;
               }
           
       }
   }
    System.out.println(max);
   
}
    
}
