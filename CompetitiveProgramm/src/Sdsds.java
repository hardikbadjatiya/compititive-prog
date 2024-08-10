
import java.util.Scanner;

public class Sdsds {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
       }
       if(n<=2)
       {
           System.out.println("0 0");
       }
       if(n>2)
       {
           int w=0;
           int q=0;
           for(int i=1;i<n-1;i++)
           {
               int x=0;
               int y=0;
               for(int j=0;j<i;j++)
               {
                   x=x+ar[j];
               }
               for(int j=i+1;j<n;j++)
               {
                   y=y+ar[j];
               }
               if(x==y)
               {
               q=i+1;
               w=y;
               break;
               }
           }
           if(q>0)
           {
               System.out.println(q+" "+w);
           }
           else{
               System.out.println("0 0");
           }
       }
   }
}
    
}
