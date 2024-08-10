
import java.util.Arrays;
import java.util.Scanner;

public class eewewewew {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int k=sc.nextInt();
       int ar[][]=new int[n][n];
        
      if(k>=(n*n+1)/2)
      {
         k=n*n-k;           
   for(int i=0;i<n;i++)
   {
       for(int j=0;j<n;j++)
       {
           ar[i][j]=1;
       }
   }  
        
       int x=0;
       while(k>0)
       {
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(k>0&&j-x>=0)
               {
                   if(j-x==i&&ar[i][j]==1)
                   {
                       ar[i][j]=0;
                       k--;
                   }
               }
               if(k==0)
               {
                   break;
               }
           }
           if(k==0)
               {
                   break;
               }
       }
       if(k==0)
               {
                   break;
               }
       x++;
       }
      }
      else{ 
           for(int i=0;i<n;i++)
   {
       for(int j=0;j<n;j++)
       {
           ar[i][j]=0;
       }
   }  
  
            int x=0;
      
       while(k>0)
       {
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(k>0&&j-x>=0)
               {
                   if((j-x==i)&&ar[i][j]==0)
                   {
             
                       ar[i][j]=1;
                       k--;
                   }
               }
               if(k==0)
               {
                   break;
               }
           }
           if(k==0)
               {
                   break;
               }
       }
       if(k==0)
               {
                   break;
               }
       x++;
       }
      }
   int maxr=0;
int minr=n+1; 

   int maxc=0;
int minc=n+1; 

   for(int i=0;i<n;i++)
   {
       int y=0;
       int z=0;
       for(int j=0;j<n;j++)
       {
           y=y+ar[i][j];
           z=z+ar[j][i];
       }
       if(z>maxc)
       {
           maxc=z;
       }
       if(z<minc)
       {
           minc=z;
       }
       if(y>maxr)
       {
           maxr=y;
       }
       if(y<minr)
       {
           minr=y;
       }
   }
   int u=((maxr-minr)*(maxr-minr))+((maxc-minc)*(maxc-minc));
       System.out.println(u);

       for(int i=0;i<n;i++)
   {
       String jk="";
            for(int j=0;j<n;j++)
       {
       jk=jk+ar[i][j];
       }
            System.out.println(jk);
   }
   
   }
   
}
    
}
