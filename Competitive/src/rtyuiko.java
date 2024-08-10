
import java.util.ArrayList;
import java.util.Scanner;

public class rtyuiko {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           
       }
       int a[]=new int[110];
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               int x=ar[i]+ar[j];
               a[x]++;
                 
           }
       }
           
       int k=0;
       ArrayList <Integer> l1=new  ArrayList<Integer> ();
       for(int j=0;j<110;j++)
       {
           int max=0;
           
       for(int i=0;i<110;i++)
       {
       if(a[i]>max) 
       {
           max=a[i];
           k=i;
                 
       }
       }
         l1.add(k);
           a[k]=-1;
         
       }
       
        int max=0;
       for(int z=0;z<l1.size();z++)
     {
     k=  l1.get(z);
       int o=0;
       int b[]=new int[n];
     
       for(int i=0;i<n-1;i++)
      {
          
        for(int j=i+1;j<n;j++)
        {
            if(ar[i]+ar[j]==k&&(b[i]==0&&b[j]==0))
            {
                
                o++;
                b[i]=1;
                b[j]=1;
                break;
            }
        }
      }
       if(o>max)
       {
           max=o;
       }
     }    System.out.println(max);
   }
   
}
    
}
