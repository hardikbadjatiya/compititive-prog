
import java.util.Scanner;

public class erere {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
           ar[i]=sc.nextInt();
       int x=-1;
           for(int i=n-1;i>=1;i--)
           {
               if(ar[i]>ar[i-1])
               {
                x=i;
                break;
               }
           }
           int o=-1;
           for(int i=x-1;i>=1;i--)
           {
               if(ar[i]<ar[i-1])
                 o=i;
               break;
           }
           if(x==-1)
               System.out.println(x);
           else
               System.out.println(o);
   }
}
    
}
