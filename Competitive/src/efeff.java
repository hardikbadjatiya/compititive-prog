
import java.util.Scanner;

public class efeff {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
     long ar[][]=new long[n][m];
     int x=0;
     
     for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            ar[i][j]=sc.nextLong();
            if(i==0||j==0||j==m-1||i==n-1)
            {
               if(ar[i][j]>3)
               {
                   x=1;
               }
            }
            else{
                if(ar[i][j]>4)
                {
                    x=1;
                }
            }
        }
       }
       if(ar[0][0]>2||ar[0][m-1]>2||ar[n-1][0]>2||ar[n-1][m-1]>2)
          {
          x=1;    
          }
       if(x==0)
       {
           
     for(int i=1;i<n-1;i++)
       {
        for(int j=1;j<m-1;j++)
        {
            ar[i][j]=4;
        }
       }
     for(int i=1;i<m-1;i++)
       {
           ar[0][i]=3;
           ar[n-1][i]=3;
       }
       for(int i=1;i<n-1;i++)
       {
           ar[i][0]=3;
           ar[i][m-1]=3;
       }
     ar[0][0]=2;
     ar[0][m-1]=2;
     ar[n-1][0]=2;
     ar[n-1][m-1]=2;
           System.out.println("YES");
       for(int i=0;i<n;i++)
       {
           String s="";
           for(int j=0;j<m;j++)
           {
               s=s+ar[i][j]+" ";
           }
           System.out.println(s);
       }
       }
       else{
           System.out.println("NO");
       }
   }
       }
    
}
