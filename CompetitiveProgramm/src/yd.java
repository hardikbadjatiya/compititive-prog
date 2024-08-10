
import java.util.Scanner;

public class yd {
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
     int y[][]=new int[n][n];
     for(int i=1;i<=n;i++)
     {
     
         System.out.println(1+" "+1+" "+i+" "+n+" "+i);
         a[i-1]=sc.nextInt();
     }
     for(int i=1;i<=n;i++)
     {
     
         System.out.println(1+" "+i+" "+1+" "+i+" "+n);
         b[i-1]=sc.nextInt();
     }
     for(int i=1;i<=n;i++)
     {
         if(a[i-1]==0)
         {
             for(int j=1;j<=n;j++)
             {
                 ar[j-1][i-1]=0;
              y[j-1][i-1]=1;
                }
         }
         
         if(a[i-1]==n)
         {
             for(int j=1;j<=n;j++)
             {
                 ar[j-1][i-1]=1;
                 y[j-1][i-1]=1;
             }
         }
         if(b[i-1]==0)
         {
             for(int j=1;j<=n;j++)
             {
                 ar[i-1][j-1]=0;
                 y[i-1][j-1]=1;
             
             }
         }
         
         if(b[i-1]==n)
         {
             for(int j=1;j<=n;j++)
             {
                 ar[i-1][j-1]=1;
              y[i-1][j-1]=1;
             
             }
         }
         
         else if(a[i-1]>0&&a[i-1]<n){
         for(int j=1;j<=n;j++)
         {
             if(b[j-1]>0)
             {
                 if(y[i-1][j-1]!=1)
                 {
                     System.out.println(1+" "+i+" "+j+" "+i+" "+j);
                     ar[i-1][j-1]=sc.nextInt();
                   y[i-1][j-1]=1;
                     if(ar[i-1][j-1]==1)
                     {
                         b[j-1]--;
                     }
                 }
             }
             else 
             {
                 if(y[i-1][j-1]!=1)
                 {
                    y[i-1][j-1]=1;
                   ar[i-1][j-1]=0;
                }
             }
             if(a[i-1]>0)
             {
             if(y[j-1][i-1]!=1)
             {
             System.out.println(1+" "+j+" "+i+" "+j+" "+i);
             ar[j-1][i-1]=sc.nextInt();
             y[j-1][i-1]=1;
             if(ar[j-1][i-1]==1)
             {
                 a[i-1]--;
             }
             }
             }
             else
             {
                 if(y[j-1][i-1]!=1)
                 {
             y[j-1][i-1]=1;
             ar[j-1][i-1]=0;
             }
             }
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
       int l=sc.nextInt();
     }
   }
}
    
}
