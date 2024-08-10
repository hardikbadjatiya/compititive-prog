
import java.util.Scanner;

public class olk {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int q=sc.nextInt();
   
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   }
   for(int i=0;i<q;i++)
   {
     int x=sc.nextInt();
     int y=sc.nextInt();
     int z=sc.nextInt();
     if(x==0)
     {
          ar[y-1]=z;
     }
     if(x==1)
     {
         int u=0;
       for(int j=y-1;j<z;j++)
       {
         if(ar[j]!=j+1)
         {
             u=1;
             break;
         }
       }
       if(u==0)
       {
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
           }
     }
   }
}
        
}
