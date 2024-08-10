
import java.util.Scanner;

class lk {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[][]=new int[n][n];
   for(int i=0;i<n;i++)
   {
       for(int j=0;j<n;j++)
       {
           ar[i][j]=sc.nextInt();
           
       }
   }
   int min=0;
   int k=0;int j=0;
   for(int i=0;i<n-1;i++)
   {
       
       if(k<n-1&&j<n-1)
       {
       min=min/2+Math.min(ar[k+1][j], ar[k][j+1]);
       if(ar[k+1][j]>=ar[k][j+1])    
       {
           j=j+1;
           
       }
       if(ar[k+1][j]<ar[k][j+1])    
       {
          k=k+1;
       }
       }
   }
    System.out.println("");
   
    System.out.println(min/2+ar[n-1][n-1]);
}
    
}
