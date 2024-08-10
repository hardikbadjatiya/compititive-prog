
import java.util.ArrayList;
import java.util.Scanner;

public class lko {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
      int n=sc.nextInt();
      int ar[]=new int[2*n];
      int a[]=new int[2*n];
      
      for(int i=0;i<2*n;i++)
        {
        ar[i]=sc.nextInt();
        a[i]=ar[i]%2;
        
        }
     ArrayList <Integer> l1=new ArrayList<Integer>();
     ArrayList <Integer> l2=new ArrayList<Integer>();
     
     int e[]=new int[2*n];
      int o=n-1;
      for(int i=0;i<2*n;i++)
        {
          for(int j=0;j<2*n;j++)
          {
              if(j!=i)
              {
                  if(e[i]==0&&e[j]==0&&o>0)
                  {
                   if((a[i]+a[j])%2==0)
                   {
                       l1.add(i+1);
                       l2.add(j+1);
                       e[i]=1;
                       e[j]=1;
                       o--;
                   }
                  }
              }
          }
        }
      for(int i=0;i<l1.size();i++)
      {
          System.out.println(l1.get(i)+" "+l2.get(i));
      }
      
        
   }
}
    
}
