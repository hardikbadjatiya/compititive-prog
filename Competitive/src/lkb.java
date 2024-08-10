
import java.util.Scanner;

public class lkb {
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
     if(k==100)
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
     else if(k!=0&&k!=100)
     {
     int a[]=new int[n];
     int b[]=new int[n];
     int c[][]=new int[n][n];
     for(int i=1;i<=n;i++)
     {
     
         System.out.println(1+" "+i+" "+1+" "+i+" "+n);
         a[i-1]=sc.nextInt();
     
     }
     for(int i=1;i<=n;i++)
     {
     
         System.out.println(1+" "+1+" "+i+" "+n+" "+i);
         b[i-1]=sc.nextInt();
     }
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=n;j++)
         {
             if(a[j-1]==0&&c[j-1][i-1]==0)
             {
               ar[j-1][i-1]=0;
               c[j-1][i-1]=1;
             }
             if(b[i-1]==0&&c[j-1][i-1]==0)
             {
                ar[j-1][i-1]=0;
               c[j-1][i-1]=1;
             }
         if(a[j-1]==n-i+1&&c[j-1][i-1]==0)
             {
              ar[j-1][i-1]=1;   
             a[j-1]--;
             b[i-1]--; 
              c[j-1][i-1]=1;
             }
         if(b[i-1]==n-j+1&&c[j-1][i-1]==0)
         {
              ar[j-1][i-1]=1;   
             a[j-1]--;
             b[i-1]--; 
              c[j-1][i-1]=1;
              
         }
         
            if(c[j-1][i-1]==0)
             {
             System.out.println(1+" "+j+" "+i+" "+j+" "+i);
             ar[j-1][i-1]=sc.nextInt();
             if(ar[j-1][i-1]==1)
            {
                 a[j-1]--;
                 b[i-1]--;
            }
                 c[j-1][i-1]=1;
             }
             
             
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
       
     }
   
   }
   
}
    
}
