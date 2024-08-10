
import java.util.ArrayList;
import java.util.Scanner;

public class weertyuyi {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);

       int n=sc.nextInt();
       int m=sc.nextInt();
       int x=sc.nextInt();
       int y=sc.nextInt();
       ArrayList <Integer> l1=new  ArrayList<>();
       ArrayList <Integer> l2=new  ArrayList<>();
       l1.add(x);
       l2.add(y);
       for(int i=y-1;i>=1;i--)
       {
           l1.add(x);
           l2.add(i);
       }
       for(int i=y+1;i<=m;i++)
       {
           l1.add(x);
           l2.add(i);
       }
       int e=0;
       for(int i=x-1;i>=1;i--)
       {
           if(e%2==0)
           {
           for(int j=m;j>=1;j--)
           {
               l1.add(i);
               l2.add(j);
           }
           e++;
           continue;
           }
           if(e%2==1)
           {
           for(int j=1;j<=m;j++)
           {
               l1.add(i);
               l2.add(j);
           }
           ++e;
           continue;
           
           }
           
           
       }
        
       for(int i=x+1;i<=n;i++)
       {
           
           if(e%2==0)
           {
           for(int j=m;j>=1;j--)
           {
               l1.add(i);
               l2.add(j);
           }
           e++;
           continue;
           }
           if(e%2==1)
           {
           for(int j=1;j<=m;j++)
           {
               l1.add(i);
               l2.add(j);
           }
           ++e;
           continue;
           
           }
       }    
          for(int i=0;i<l1.size();i++)
          {
              System.out.println(l1.get(i)+" "+l2.get(i));
          }
       
       
       
   
}
    
}
