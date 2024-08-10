
import java.util.Arrays;
import java.util.Scanner;

public class Ssaas {
     public static int gcd(int x,int y){
        int r1=x%y;
        int r2=y%x;
        if(r1==0 || r2==0) return 0;
        return 1;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           
       }
       
      int arr[]=new int[ar[n-1]+1];
      
      int r=0;
      int x=0;
   
       
      
      for(int i=n-1;i>=0;i--)
        {
            if(ar[i]>m)
            {
                x=1;
                arr[ar[i]]++;
                break;
            }
             if(m%ar[i]!=0){
                  int l=m/ar[i];
                  arr[ar[i]]=arr[ar[i]]+l+1;
                  x=1;
                  break;
               }
              
        }
      if(x==0)
      {
          int e=-1;
          int q=-1;
      l1:for(int i=n-1;i>=0;i--)
        {
            
       if(ar[i]!=1)
            {
                   for(int j=n-1;j>=0;j--)
                   {
                      if(ar[j]!=1&&j!=i&&ar[i]!=ar[j]&&gcd(ar[i],ar[j])==1)
                      {
                        e=i;    q=j;  
                        x=1;
                     
                         if(ar[j]>ar[i])
                         {
                arr[ar[j]]=arr[ar[j]]+m/ar[j]-1;
               arr[ar[i]]=arr[ar[i]]+ar[j]/ar[i]+1;
               x=1;
                break l1;
                    
                         }
                         if(ar[i]>ar[j])
                         {
                arr[ar[i]]=arr[ar[i]]+m/ar[i]-1;
               arr[ar[j]]=arr[ar[j]]+ar[i]/ar[j]+1;
               x=1;
                break l1;
                    
                         } 
                      }
                      
                      
                      
                   
                   }
                   
               
               
            }
            
        }
      }
      if(x==1)
      {
      String s="YES ";
      for(int i=0;i<n;i++)
      {
          s=s+arr[ar[i]]+" ";
      }
      System.out.println(s);
      
      }
      else{
          System.out.println("NO");
      }
       
       
       
       
   }
}
    
}
