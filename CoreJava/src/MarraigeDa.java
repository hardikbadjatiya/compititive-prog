
import java.util.ArrayList;
import java.util.Scanner;

public class MarraigeDa {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int p=0;p<t;p++)
   {
       int n=sc.nextInt();
     ArrayList <Integer> l1=new ArrayList <Integer>();
        int f=0;
     for(int j=0;j<n;j++)
     { 
       int k=sc.nextInt();
       int ar[]=new int[k];
       int x=0;
     
       for(int i=0;i<k;i++)
       {
           ar[i]=sc.nextInt();
       }
       for(int i=0;i<k;i++)
       {
           int er=0;
       if(l1.contains(ar[i]))
       {
       er=1;
       }
    if(er==0)
       {
           x=1;
           l1.add(ar[i]);
        break;
       }
       }
       if(x==0)
       {
           f=j+1;
       }
     }
        
      int u=0;
       if(l1.size()==n)
      {
          System.out.println("OPTIMAL");
      } if(l1.isEmpty())
      {
          System.out.println("IMPROVE");
           System.out.println("1 1");
       
      }
      else{
          
       if(l1.size()<n)
       {
     
       for(int i=1;i<=n;i++)
      {
          int w=0;
           if(l1.contains(i))
           {
               w=1;
           }
           if(w==0)
           {
               u=i;
               break;
               
           }      
         }
       if(u==0)
       {
               System.out.println("IMPROVE");
           System.out.println(f+" "+(l1.get(l1.size()-1)+1));
       }
       else{
           System.out.println("IMPROVE");
           System.out.println(f+" "+u);
       }
       }
      }
   }         
}
}