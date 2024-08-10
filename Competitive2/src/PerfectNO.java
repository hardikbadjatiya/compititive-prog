
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PerfectNO {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
  int t=sc.nextInt();
  for(int k=0;k<t;k++)
  {
   int n=sc.nextInt();
   int m=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
   ar[i]=sc.nextInt();
   
   }
Arrays.sort(ar);
if(m==n)
{
    System.out.println(ar[n-1]);
    System.exit(0);
}
      ArrayList <Integer> l1=new ArrayList<Integer>();
        
      int x=0;
 int p=m;
//for(int l=0;l<n;l++)
//{
  for(int i=0;i<n;i++)
  {
      
      if(x<=ar[i])
      {
        x=x+ar[i];
      }
     else
      {
          l1.add(x);
          p=p-1;
          x=ar[i];
//          if(n-i==p)
//          {
//  for(int d=n-m+1;d<n;d++)
//  {
//  l1.add(ar[d]);    
//  }              
//          }
          
      }
      
  }
  
    

  for(int i=n-m+1;i<n;i++)
  {
  l1.add(ar[i]);    
  }
  java.util.Collections.sort(l1);
      System.out.println(l1.get(l1.size()-1));
  }
}
}
