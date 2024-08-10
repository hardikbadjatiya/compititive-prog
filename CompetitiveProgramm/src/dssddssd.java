
import java.util.Scanner;

public class dssddssd {
public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
     int n=sc.nextInt();
     int k=sc.nextInt();
     int ar[][]=new int[n][n];
     if(k==0)
     {
         System.out.println(2);
     for(int i=1;i<=n;i++)
     {
         String s="";
         for(int j=1;j<=n-1;j++)
         {
             s=s+"0 ";
         }
         s=s+"0";
         System.out.println(s);
     }
     int l=sc.nextInt();
     }
     if(k==0)
     {
         System.out.println(2);
     for(int i=1;i<=n;i++)
     {
         String s="";
         for(int j=1;j<=n-1;j++)
         {
             s=s+"1 ";
         }
         s=s+"1";
         System.out.println(s);
     }
     int l=sc.nextInt();
     }
     else if(k!=0&&k!=1)
     {
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=n;j++)
         {
             System.out.println(1+" "+i+" "+j+" "+i+" "+j);
             ar[i-1][j-1]=sc.nextInt();
         }
     }
       System.out.println(2);
       
       for(int i=0;i<n;i++)
       {
           String s="";
           for(int j=0;j<n-1;j++)
           {
             s=s+ar[i][j]+" ";
           }
           s=s+ar[i][n-1];
           System.out.println(s);
       }
       int l=sc.nextInt();
     } 
   }
}
    
}
