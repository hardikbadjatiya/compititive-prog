
import java.util.Scanner;

public class SquareFinal{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    for(int k=0;k<t;k++)
    {
       int n=sc.nextInt();
      int  arr[]=new int[n];
      for(int i=0;i<n;i++)
       {
           int o=0;
           long ar=sc.nextLong();
           ar=Math.abs(ar-0);
           if(ar==0&&o==0)
           {
               arr[i]=0;
               o=1;
           }
           if(ar%4==0&&o==0)
           {
               arr[i]=4;
               o=1;
           }
           if( ar%2==0&&ar%4!=0&&o==0)
           {
               arr[i]=2;
               o=1;
           }
           if(o==0)
           {
               arr[i]=1;
           }
       }
       long p=0;
       int odd=0;
       int two=0;
       int pos2=-1;
       int pos1s=-1;
       int pos1e=-1;
       int r=1;
       int l=1;
       
       for(int i=0;i<n;i++)
       {
           if(arr[i]==1)
           {
              if(two==0)
               {
              if(pos1s==-1)
              {
                 pos1s=i; 
              }
              ++l;
              }
              if(two==1)
              {
                  if(pos1s==-1)
                  {
                   pos1e=i;
                  }
                  r=r+1;
              }
               if(i==n-1&&odd>0&&two>0)
               {
                   p=p+l*(r);
               }
           }
           if(arr[i]==2)
           {    ++odd;
     
           
               if(two==1)
               {
                p=p+l*(r);
       
                pos1s=pos1e;
                   l=r;
                   r=1;
                   two=0;
                   pos1e=-1;
               }
                 
               two++;
               if(i==n-1)
               {
                   p=p+l*(r);
               }               
           }
           else if(arr[i]==0||arr[i]==4)
           {
               if((l>=1||r>=1)&&odd>0&&two>0)
               {
                   p=p+l*(r);
               }
                   l=1;
                   r=1;
                   two=0;
                   pos2=-1;
                   pos1s=-1;
                   pos1e=-1;
          }
       }
       long q=n*(n+1);
       long w=q/2;
       long a=w-p;
       System.out.println(a);
    }
}    
}
