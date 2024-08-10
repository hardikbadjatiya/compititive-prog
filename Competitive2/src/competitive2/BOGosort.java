package competitive2;

import java.util.Arrays;
import java.util.Scanner;

public class BOGosort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
       while(l-->0)
       {
           int n=sc.nextInt();
           int ar[]=new int[n];
           for(int i=0;i<n;i++)
           {
               ar[i]=sc.nextInt();
               
           }
           int x=0;
           int y=0;
           for(int i=0;i<n;i++)
           {
               for(int j=i+1;j<n;j++)
               {
                   if(ar[j]-ar[i]==j-i)
                   {
                   x=ar[i];
                   ar[i]=ar[j];
                   ar[j]=x;
                   y=0;
                   
                   }
                   
               }
           }
              for(int i=0;i<n;i++)
           {
        
           System.out.print(ar[i]+" ");
       }
              System.out.println("");
       }
    }}
    

