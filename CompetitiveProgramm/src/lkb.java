
import java.util.Arrays;
import java.util.Scanner;

public class lkb {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int x=sc.nextInt();
       int ar[]=new int[n];
       int a[]=new int[n];
       ar[0]=sc.nextInt();
       a[0]=ar[0];
       for(int i=1;i<n;i++)
       {
           ar[i]=sc.nextInt();
       a[i]=a[i-1]+ar[i];    
       }
     int max=0;
       for(int i=0;i<n;i++)
       {
           for(int j=n-1;j>=0;j--)
           {
               int u=a[j];
              int y=0;
               if(i-1>=0)
              {
                 y=a[i-1];
              }
              if((u-y)%x!=0)
              {
                  
                int o=j-i+1 ;
                if(o>max)
                {
                    max=o;
                }
                break;
              }
           }
       }
       if(max!=0)
       {
           System.out.println(max);
       }
       else{
           System.out.println(-1);
       }
       
   }
}
    
}
