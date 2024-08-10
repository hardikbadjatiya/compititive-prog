/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codesd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
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
     for(int i=1;i<=n-1;i++)
     {
         if(a[i-1]==0)
         {
             for(int j=1;j<=n;j++)
             {
                 ar[i-1][j-1]=0;
             }
         }
         if(a[i-1]==n)
         {
             for(int j=1;j<=n;j++)
             {
                 ar[i-1][j-1]=1;
                 b[j-1]--;
             }
         }
         else if(a[i-1]>0&&a[i-1]<n){
         for(int j=1;j<=n;j++)
         {
             if(a[i-1]>0)
             {
             if(a[i-1]==n-j+1)
             {
                 
             ar[i-1][j-1]=1;   
             a[i-1]--;
             b[j-1]--; 
             }
             else
             {
             System.out.println(1+" "+i+" "+j+" "+i+" "+j);
             ar[i-1][j-1]=sc.nextInt();
             if(ar[i-1][j-1]==1)
            {
                 a[i-1]--;
                 b[j-1]--;
            }
             }
             }
             else if(a[i-1]==0)
             {
             ar[i-1][j-1]=0;
             
             }
             
         }
         }
     }
       System.out.println(2);
       
       for(int i=0;i<n-1;i++)
       {
           String s="";
           for(int j=0;j<n-1;j++)
           {
             s=s+ar[i][j]+" ";
           }
           s=s+ar[i][n-1];
           System.out.println(s);
       }
       String h="";
       for(int i=0;i<n-1;i++)
       {
           h=h+b[i]+" ";
       }
       h=h+b[n-1];
         System.out.println(h);
       int l=sc.nextInt();
     }
   }
	}
}
