
import java.util.Scanner;

public class sdd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   for(int o=1;o<=t;o++)
   {
       int n=sc.nextInt();
       int ar[][]=new int[n][n];
       
       String a=sc.next();
       String d=sc.next()
               ;
       for(int i=0;i<n;i++)
       {
          int x=1;
          ar[i][i]=1;
          int w=i;
          for(int j=i+1;j<n;j++)
          {
            if(d.charAt(w)=='N')
            {
                x=0;
                
            }
            
            else if(a.charAt(j)=='Y'&&x==1)
            {
               
               ar[i][j]=1;
            }
            else
            {
                ar[i][j]=0;
                x=0;
            }
          w=j;  
          }
          int u=i;
          int r=1;
          for(int j=i-1;j>=0;j--)
          {
             if(d.charAt(u)=='N')
             {
                 r=0;
             }
             else if(a.charAt(j)=='Y'&&r==1){
                ar[i][j]=1;
             }
             else{
                 r=0;
             }
            u=j; 
          }
          
          
       }
          System.out.println("Case #"+(o)+":");
       
      for(int i=0;i<n;i++)
      {
         String s="";
          for(int j=0;j<n;j++)
          {
              if(ar[i][j]==1)
              {
                  s=s+"Y";
              }
              else{
                  s=s+"N";
              }
          }
          System.out.println(s);
          
      }
          
   }
}
    
}
