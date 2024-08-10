
import static java.sql.JDBCType.INTEGER;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class plo {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   ArrayList <Integer > l1=new ArrayList<Integer>();
   for(int i=n;i<=m;i++)
   {
      if(i==2||i==3)
      {
          l1.add(i);
      }
      else{
          if(i%6==1||i%6==5)
          {
              int x=0;
              for(int j=2;j<=Math.sqrt(i);j++)
              {
                  if(i%j==0)
                  {
                      x=1;
                      break;
                  }
              }
              if(x==0)
              {
                  l1.add(i);
              }
          }
          
      }
      
   } 
   
    ArrayList <Integer> l2= new  ArrayList<Integer>();
   int x=l1.size();
   int max=0;
   int min =100000000;
   for(int i=0; i<x;i++)
   {
       for(int j=0;j<x;j++)
       {
           if(j!=i)
           {
           String s=l1.get(i)+""+l1.get(j);
           int u=Integer.parseInt(s);
           if(u%6==1||u%6==5)
           {
             int l=0;  
         for(int k=2;k<=Math.sqrt(u);k++)
         {
             if(u%k==0)
             {
                 l=1;
                 break;
             }
         }
          if(l==0)
          {
           if(l2.contains(u)!=true)
           {
           l2.add(u);   
           } if(u>max)
          {
              max=u;
          }
          if(u<min)
          {
              min=u;
          }
          }
           }
           }
       }
       
   }
   int o=l2.size();
    long ar[]=new  long[o];
    ar[0]=min;
    ar[1]=max;
    for(int i=2;i<o;i++)
    {
        ar[i]=ar[i-1]+ar[i-2];
    }
    System.out.println(ar[o-1]); 
    
}
}
