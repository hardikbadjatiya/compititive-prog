
import java.util.Arrays;
import java.util.Scanner;

public class adfaf {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   
   
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
      String st="";
      
      for(int i=0;i<n;i++)
      {
          ar[i]=0;
          st=st+"0 ";
      }
      if(n%2!=0)
      {
          ar[n/2]=1;
          
      }
      else{
          ar[n/2-1]=1;
      }
      int x=1;
      
      while(x<=n)
      {
          int max=1;int e=0;
          int w=0;
          for(int i=0;i<n;i++)
          {
              
              if(ar[i]==0)
              {
                  ++w;
          if(w>max&&x==n)
                  {
                      max=w;
                      e=i;
                  if(max%2==0)
          {
              ar[(e+e-max+1)/2]=x+1;
              x=x+1;
          }
          else{
              ar[(e+e-max+1)/2]=x+1;
              x=x+1;
          }
                  }         
              }
              if(ar[i]!=0)
              {
                  if(w>max)
                  {
                      System.out.println(w+" "+max+" "+i);
                      max=w;
                      e=i-1;
                      w=0;
          if(max%2==0)
          {
              ar[(e+e-max+1)/2]=x+1;
              x=x+1;
          }
          else{
              ar[(e+e-max+1)/2]=x+1;
              x=x+1;
          }
                  }
              }
          }
          
         
      }
       System.out.println(Arrays.toString(ar));
   }
}
    
}
