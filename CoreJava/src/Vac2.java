
import java.util.Scanner;

public class Vac2 {
    
public static void main(String[] args) {
  Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int r=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   }
  for(int i=0;i<n;i++)
  {
      if(ar[i]==0)
      {
          ++r;
      }
      if(ar[i]==1&&ar[i+1]==1)
      {
          ++r;
      }
      if(ar[i]==2&&ar[i+1]==2)
      {
          ++r;
      }
      
      
  }
  for(int i=0;i<n;i++)
  {
      if(ar[i]==1)
      {
          int th=0;
          for(int j=i+1;i<n;i++)
          {
              if(ar[j]==3)
              {
                  ++th;
              }
              else if(ar[j]==2){
                  if(th%2!=0)
                  {
                      ++r;
                  }
                 break; 
              }
          }
      }
      if(ar[i]==2)
      {
          int th=0;
          for(int j=i+1;i<n-1;i++)
          {
              if(ar[j]==3)
              {
                  ++th;
              }
              else if(ar[j]==1){
                  if(th%2!=0)
                  {
                      ++r;
                  }
                 break; 
              }
          }
      }
      System.out.println(r);   
  }
}
}
  
