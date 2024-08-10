
import java.util.ArrayList;
import java.util.Scanner;

public class Code7 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int k=0;k<t;k++)
   {
  ArrayList <Integer>l=new ArrayList<Integer>();
     
       int n=sc.nextInt();
       long ar[]=new long[n];
       long arr[]=new long[n];
       for(int i=0;i<n;i++)
       {
           int o=0;
           ar[i]=sc.nextLong();
           long x=ar[i]%4;
           if(ar[i]==0&&o==0)
           {
               arr[i]=0;
               o=1;
           }
           if(ar[i]%4==0&&o==0)
           {
               arr[i]=4;
               o=1;
           }
           if( ar[i]%2==0&&ar[i]%4!=0&&o==0)
           {
               arr[i]=2;
               o=1;
               l.add(i);
           }
           if(o==0)
           {
               arr[i]=1;
           }
       }
       ArrayList <Integer>l1=new ArrayList<Integer>();
       ArrayList <Integer>l2=new ArrayList<Integer>();
       ArrayList <Integer>l3=new ArrayList<Integer>();
        int a=0;
        int x=0;
        int two=0;
       for(int i=0;i<n;i++)
       {
           if(ar[i]==1)
           {
               ++a;
           }
           if(ar[i]==2)
           {
               x=x+1;
               if(x==1)
               {
               two=i;
               }
               if(x==2&&a>0)
              {
               x=1;
               two=a;
              }
           }
           if(ar[i]==4||ar[i]==0)
           {
               if(x==1&&a>0)
                {
               
                }
              x=0;
              a=0;
          }
       }
    }
}
    
}
