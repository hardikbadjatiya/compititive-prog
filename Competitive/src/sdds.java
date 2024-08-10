
import java.util.ArrayList;
import java.util.Scanner;

public class sdds {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            ArrayList <Integer> ln=new ArrayList<Integer>();
            ArrayList <Integer> lm=new ArrayList<Integer>();
            ArrayList <Integer> ln1=new ArrayList<Integer>();
            ArrayList <Integer> lm1=new ArrayList<Integer>();
                
            int min=10000000;
           int max=0;
           int ar[][]=new int[n][m];
           
           for(int i=0;i<n;i++)
           {
               for(int j=0;j<m;j++)
               {
               ar[i][j]=sc.nextInt();
               
               if(ar[i][j]>max)
               {
                   max=ar[i][j];
                  ln1.removeAll(ln1);
                   lm1.removeAll(lm1);
                   ln1.add(i);
                   lm1.add(j);
              
               }
               
               if(ar[i][j]==max)
               {
              if(ln1.contains(i)!=true)
                   {
                   ln1.add(i);
                   }
                   if(lm1.contains(j)!=true)
                   {
                   lm1.add(j);
                   }
                    }
               if(ar[i][j]<min)
               {
                   min=ar[i][j];
                   ln.removeAll(ln);
                   lm.removeAll(lm);
                   ln.add(i);
                   lm.add(j);
               }
               if(ar[i][j]==min)
               {
                   if(ln.contains(i)!=true)
                   {
                   ln.add(i);
                   }
                   if(lm.contains(j)!=true)
                   {
                   lm.add(j);
                   }
               }
           }
               
               
        }
            
            lm.removeAll(lm1);
            ln.removeAll(ln1);
           int y=lm.size()+lm1.size();
           int z=ln.size()+ln1.size();
            
           
        int o=n*m-(y*n)-(z*m)+z*y;
           System.out.println(o);
        }
}
    
}
