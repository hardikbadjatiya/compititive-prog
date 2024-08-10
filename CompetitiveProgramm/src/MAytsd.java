
import java.util.Scanner;

public class MAytsd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int ar[][]=new int[n][m];
       int a=0;
       int v=0;
       String r[]=new String[n];
       String c[]=new String[m];
       
       for(int i=0;i<n;i++)
       {
           r[i]="";
           
           for(int j=0;j<m;j++)
           {
               ar[i][j]=sc.nextInt();
               r[i]=r[i]+ar[i][j];
           }
       }
       for(int j=0;j<m;j++)
       {
           c[j]="";
           for(int i=0;i<n;i++)
           {
           c[j]=c[j]+ar[i][j];    
           }
       }
       int y=0;
      int l[]=new int[n];
      int b[]=new int[m];
   
      for(int i=0;i<n;i++)
      {
          if(r[i].contains("1")!=true)
          {
      ++y;        
          }
      }
      int p=0;
      for(int j=0;j<m;j++)
         {
             
             if(c[j].contains("1")!=true)
             {
      ++p;           
             }
             }
         
      int o=Math.min(p,y);
      if(o%2==0)
      {
       System.out.println("Vivek");
          
      }
      else{
          System.out.println("Ashish");
      }
   }
}
    
}
